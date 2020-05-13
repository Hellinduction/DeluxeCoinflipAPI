package fun.lewisdev.coinflip.api;

import fun.lewisdev.coinflip.player.PlayerData;
import fun.lewisdev.coinflip.provider.AbstractProvider;
import org.bukkit.entity.Player;

public interface CoinflipAPI {

    /**
     * Register a custom economy provider
     *
     * @param provider The economy provider
     */
    void setEconomyProvider(AbstractProvider provider);

    /**
     * Fetch player data
     *
     * @param player The player to search
     */
    PlayerData getPlayerCoinflipData(Player player);
}
