package fun.lewisdev.coinflip.events;

import fun.lewisdev.coinflip.game.CoinflipGame;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class CoinflipCreatedEvent extends Event {

    private static final HandlerList HANDLERS_LIST = new HandlerList();

    private Player player;
    private CoinflipGame coinflipGame;

    public CoinflipCreatedEvent(Player player, CoinflipGame coinflipGame) {
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