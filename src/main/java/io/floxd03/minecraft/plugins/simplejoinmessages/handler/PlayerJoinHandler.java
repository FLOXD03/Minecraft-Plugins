package io.floxd03.minecraft.plugins.simplejoinmessages.handler;

import io.floxd03.minecraft.plugins.simplejoinmessages.factories.MessageFactory;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.Plugin;

/**
 * Handles everything that should happen if a player joins the server.
 *
 * @author FLO_XD03©
 * @version 22.05.2022
 */
public class PlayerJoinHandler implements Listener {

    /**
     * Constructor which also registers this event handler on given plugin.
     *
     * @param plugin Plugin where this event handler should be registered.
     */
    public PlayerJoinHandler(final Plugin plugin) {
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onPlayerJoin(final PlayerJoinEvent event) {
        event.joinMessage(MessageFactory.createJoinMessage(event.getPlayer()));
    }

}
