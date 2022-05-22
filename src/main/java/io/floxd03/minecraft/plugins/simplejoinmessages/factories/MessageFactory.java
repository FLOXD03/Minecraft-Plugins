package io.floxd03.minecraft.plugins.simplejoinmessages.factories;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.entity.Player;

/**
 * This is used for creating messages that will be printed to chat.
 *
 * @author FLO_XD03©
 * @version 22.05.2022
 */
public class MessageFactory {

    /**
     * Creates a join message.
     *
     * @param player Player that joined the server.
     * @return A new {@link TextComponent} that contains the join message.
     */
    public static TextComponent createJoinMessage(final Player player) {
        return createPrefix("+", NamedTextColor.GREEN)
                .append(player.displayName().color(NamedTextColor.GREEN))
                .append(Component.text(" ist dem Server beigetreten!").color(NamedTextColor.GOLD));
    }

    /**
     * Creates a quit message.
     *
     * @param player Player that left the server.
     * @return A new {@link TextComponent} that contains the quit message.
     */
    public static TextComponent createQuitMessage(final Player player) {
        return createPrefix("-", NamedTextColor.RED)
                .append(player.displayName().color(NamedTextColor.RED))
                .append(Component.text(" hat den Server verlassen!").color(NamedTextColor.GOLD));
    }

    /**
     * Creates the prefix of the chat message.
     *
     * @param prefixText Text that should be in prefix.
     * @param prefixColor Color that the prefix text should have.
     * @return A new {@link TextComponent} that contains the prefix.
     */
    public static TextComponent createPrefix(final String prefixText, final NamedTextColor prefixColor) {
        return Component.text("[").color(NamedTextColor.GOLD)
                .append(Component.text(prefixText).color(prefixColor).decorate(TextDecoration.BOLD))
                .append(Component.text("] ").color(NamedTextColor.GOLD));
    }

}
