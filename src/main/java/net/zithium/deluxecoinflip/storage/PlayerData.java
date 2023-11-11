package net.zithium.deluxecoinflip.storage;

import java.util.UUID;

public class PlayerData {

    private final UUID uuid;
    private int wins, losses;
    private double profit;
    private boolean displayBroadcastMessages;

    public PlayerData(UUID uuid, int wins, int losses, long profit, boolean displayBroadcastMessages) {
        this.uuid = uuid;
        this.losses = losses;
        this.wins = wins;
        this.profit = profit;
        this.displayBroadcastMessages = displayBroadcastMessages;
    }

    public PlayerData(UUID uuid, int wins, int losses, long profit) {
        this(uuid, wins, losses, profit, true);
    }

    public PlayerData(UUID uuid) {
        this(uuid, 0, 0, 0, true);
    }

    public UUID getUUID() {
        return uuid;
    }

    public Integer getLosses() {
        return losses;
    }

    public Integer getWins() {
        return wins;
    }

    public double getProfit() {
        return profit;
    }

    public String getProfitFormatted() {
        return null;
    }

    public void updateWins() {}

    public void updateLosses() {}

    public void updateProfit(double profit) {}

    public double getWinPercentage() {
        return 0;
    }

    public boolean isDisplayBroadcastMessages() {
        return displayBroadcastMessages;
    }

    public void setDisplayBroadcastMessages(boolean displayBroadcastMessages) {
        this.displayBroadcastMessages = displayBroadcastMessages;
    }
}
