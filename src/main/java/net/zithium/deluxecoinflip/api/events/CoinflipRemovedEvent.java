package net.zithium.deluxecoinflip.api.events;

import net.zithium.deluxecoinflip.game.CoinflipGame;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class CoinflipRemovedEvent extends Event {
    private static final HandlerList HANDLERS_LIST = new HandlerList();

    private final Player player;
    private final CoinflipGame coinflipGame;

    public CoinflipRemovedEvent(Player player, CoinflipGame coinflipGame) {
        this.player = player;
        this.coinflipGame = coinflipGame;
    }

    public Player getPlayer() {
        return player;
    }

    public CoinflipGame getCoinflipGame() {
        return coinflipGame;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }
}