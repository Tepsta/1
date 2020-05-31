import java.awt.image.BufferedImage;

public class Card {
	private String translation;
	private BufferedImage cardImage;

	public Card(String translation, BufferedImage cardImage) {
		this.translation = translation;
		this.cardImage = cardImage;
	}

	public BufferedImage getImage() {
		return cardImage;
	}

	public String getTranslation() {
		return translation;
	}

	@Override
	public String toString() {
		return "Card [translation=" + translation + ", cardImage=" + cardImage + "]";
	}
}
