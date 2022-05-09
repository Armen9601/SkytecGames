package com.example.skytecgames.manager;

import com.example.skytecgames.entity.Clan;
import com.example.skytecgames.exception.EntityNotFoundException;
import com.example.skytecgames.repository.ClanRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ClanManager {

    @Autowired
    private static ClanRepository clanRepository;

    public static Clan getClan(long clanId) {
        return clanRepository.findById(clanId).orElseThrow(EntityNotFoundException::new);
    }

    public static boolean saveClan(long clanId) {
        return false;
    }
    @Transactional(isolation = Isolation.SERIALIZABLE)
    public int addGoldInClan(long clanId, int gold) {
        Clan clan = clanRepository.findById(clanId).orElseThrow(EntityNotFoundException::new);
        int total = clan.getGold() + gold;
        clan.setGold(total);
        clanRepository.save(clan);
        return total;
    }


}
