package com.example.skytecgames.controller;

import com.example.skytecgames.manager.ClanManager;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clan")
@RequiredArgsConstructor
public class ClanController {

    private final ClanManager clanManager;

    @GetMapping("/{clanId}/{gold}")
    public void incGold(@PathVariable long clanId, @PathVariable int gold) {
        clanManager.addGoldInClan(clanId, gold);
    }


}
