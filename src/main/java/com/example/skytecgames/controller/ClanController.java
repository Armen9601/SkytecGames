package com.example.skytecgames.controller;

import com.example.skytecgames.entity.Clan;
import com.example.skytecgames.manager.ClanManager;

public class ClanController {

    public void incGold(long clanId, int gold) {
        Clan clan = ClanManager.getClan(clanId);
        if (clan != null) {
            clan.setGold(gold);
        }
    }


}
