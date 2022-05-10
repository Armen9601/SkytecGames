package com.example.skytecgames.controller;

import com.example.skytecgames.manager.TrackerManager;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tracker")
@RequiredArgsConstructor
public class TrackerController {

    private final TrackerManager trackerManager;

    @GetMapping("/{clanId}/{userId}/{gold}")
    public void incGold(@PathVariable long clanId, @PathVariable long userId, @PathVariable int gold) {
        trackerManager.trackerClanGold(clanId, userId, gold);
    }

}
