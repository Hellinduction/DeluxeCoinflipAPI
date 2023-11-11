package net.zithium.deluxecoinflip.api;

import net.zithium.deluxecoinflip.storage.PlayerData;
import net.zithium.deluxecoinflip.economy.provider.EconomyProvider;
import org.bukkit.entity.Player;

import java.util.Optional;

public interface DeluxeCoinflipAPI {

    /**
     * Register a custom economy provider with a required plugin.
     * We will check if the plugin is enabled.
     *
     * @param provider The economy provider
     * @param requiredPlugin The plugin required
     */
    void registerEconomyProvider(EconomyProvider provider, String requiredPlugin);

    /**
     * Fetch player data
     *
     * @param player The player to search
     * @return  Optional of player data, represents if they are loaded in cache
     */
    Optional<PlayerData> getPlayerData(Player player);
}
