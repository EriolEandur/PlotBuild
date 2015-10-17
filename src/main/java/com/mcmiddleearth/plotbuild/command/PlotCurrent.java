/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mcmiddleearth.plotbuild.command;

import com.mcmiddleearth.plotbuild.data.PluginData;
import com.mcmiddleearth.plotbuild.plotbuild.PlotBuild;
import com.mcmiddleearth.plotbuild.utils.MessageUtil;
import org.bukkit.command.CommandSender;

/**
 *
 * @author Ivan1pl
 */
public class PlotCurrent extends AbstractCommand {
    
    public PlotCurrent(String... permissionNodes) {
        super(1, true, permissionNodes);
    }
    
    @Override
    protected void execute(CommandSender cs, String... args) {
        PlotBuild plotbuild = PluginData.getPlotBuild(args[0]);
        if(plotbuild == null) {
            sendNoPlotbuildFoundMessage(cs);
        } else {
            sendCurrentPlotbuildSetMessage(cs);
        }
    }
    
    private void sendNoPlotbuildFoundMessage(CommandSender cs) {
        MessageUtil.sendErrorMessage(cs, "No plotbuild with this name.");
    }
    
    private void sendCurrentPlotbuildSetMessage(CommandSender cs) {
        MessageUtil.sendInfoMessage(cs, "Current plotbuild set.");
    }
    
}
