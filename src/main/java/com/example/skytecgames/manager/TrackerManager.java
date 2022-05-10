package com.example.skytecgames.manager;

import com.example.skytecgames.entity.Clan;
import com.example.skytecgames.entity.Tracker;
import com.example.skytecgames.repository.TrackerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class TrackerManager {

    @Autowired
    private static TrackerRepository trackerRepository;

    @Transactional
    public void trackerClanGold(long clanId, long userId, int gold) {
        Clan clan = ClanManager.getClan(clanId);
        clan.setGold(gold);
        trackerRepository.save(Tracker.builder()
                .clanID(clanId)
                .userID(userId)
                .gold(gold)
                .build());
    }

}
