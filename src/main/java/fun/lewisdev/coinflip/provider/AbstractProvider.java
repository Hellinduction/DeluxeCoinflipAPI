package fun.lewisdev.coinflip.provider;

import org.bukkit.OfflinePlayer;

public abstract class AbstractProvider {

    private String identifier;
    private String name;

    public AbstractProvider(String identifier) {
        this.identifier = identifier;
    }

    public abstract double getBalance(OfflinePlayer player);

    public abstract void withdraw(OfflinePlayer player, double amount);

    public abstract void deposit(OfflinePlayer player, double amount);

    public String getIdentifier() {
        return identifier;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
