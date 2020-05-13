package fun.lewisdev.coinflip.provider;

import org.bukkit.OfflinePlayer;

public interface AbstractProvider {

    public String getIdentifier();

    public double getBalance(OfflinePlayer player);

    public void withdraw(OfflinePlayer player, double amount);

    public void deposit(OfflinePlayer player, double amount);

}
