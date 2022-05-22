package io.floxd03.minecraft.plugins.simplejoinmessages.commands;

import io.floxd03.minecraft.plugins.simplejoinmessages.constants.PermissionsList;
import io.floxd03.minecraft.plugins.simplejoinmessages.factories.MessageFactory;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.PluginCommand;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

/**
 * This command is used to print all custom messages to your local chat.
 *
 * @author FLO_XD03©
 * @version 22.05.2022
 */
public class TestMessagesCommand implements CommandExecutor {

    /**
     * Constructor which also registers this command.
     */
    public TestMessagesCommand() {
        final PluginCommand testCommand = Bukkit.getPluginCommand("test-messages");

        if (testCommand != null) {
            testCommand.setExecutor(this);
        }
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;

            if (p.hasPermission(PermissionsList.PERMISSION_TEST_MESSAGES)) {
                p.sendMessage(MessageFactory.createJoinMessage(p));
                p.sendMessage(MessageFactory.createQuitMessage(p));

                return true;
            }
        }

        return false;
    }

}
