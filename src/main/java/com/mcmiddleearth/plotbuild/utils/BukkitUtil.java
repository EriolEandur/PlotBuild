/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mcmiddleearth.plotbuild.utils;

import java.util.List;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

/**
 *
 * @author Eriol_Eandur
 */
public class BukkitUtil {
    
    public static boolean isSame(OfflinePlayer player1, OfflinePlayer player2) {
        return player1.getUniqueId().equals(player2.getUniqueId());
    }
    
    public static void removePlayerFromList(List<OfflinePlayer> list, OfflinePlayer player) {
        for(OfflinePlayer search: list) {
            if(search.getUniqueId().equals(player.getUniqueId())) {
                list.remove(search);
                return;
            }
        }
    }
    
    public static boolean isOnline(OfflinePlayer player) {
        return Bukkit.getPlayer(player.getUniqueId())!=null;
    }
    
    public static Player getPlayer(OfflinePlayer player) {
        return Bukkit.getPlayer(player.getUniqueId());
    }
}
