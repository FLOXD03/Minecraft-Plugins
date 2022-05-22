package io.floxd03.minecraft.plugins.simplejoinmessages.handler;

import io.floxd03.minecraft.plugins.simplejoinmessages.factories.MessageFactory;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.Plugin;

/**
 * Handles everything that should happen if a player quits the server.
 *
 * @author FLO_XD03©
 * @version 22.05.2022
 */
public class PlayerQuitHandler implements Listener {

    /**
     * Constructor which also registers this event handler on given plugin.
     *
     * @param plugin Plugin where this event handler should be registered.
     */
    public PlayerQuitHandler(final Plugin plugin) {
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onPlayerQuit(final PlayerQuitEvent event) {
        event.quitMessage(MessageFactory.createQuitMessage(event.getPlayer()));
    }

}
