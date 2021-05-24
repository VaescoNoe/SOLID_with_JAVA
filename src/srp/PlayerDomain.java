package srp;

public class PlayerDomain {
	Double winPorcentage(Player player) {
		return Double.valueOf(player.getWin() / (player.getLose() + player.getLose()));
	}

	Double losePorcentage(Player player) {
		return 0.0;
	}

}
