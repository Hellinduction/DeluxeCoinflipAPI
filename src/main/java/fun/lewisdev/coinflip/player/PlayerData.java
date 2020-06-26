package fun.lewisdev.coinflip.player;

public class PlayerData {

    private int wins, losses;
    private double profit;

    public PlayerData(Integer wins, Integer losses, long profit) {
        this.losses = losses;
        this.wins = wins;
        this.profit = profit;
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
}
