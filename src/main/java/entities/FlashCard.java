package entities;
/**
 * 
 * @author SeriousSimon (⌐■_■)
 * Object to store information needed to create an flash card
 */
public class FlashCard {
	
	String question;
	String answer;
	
	FlashCard(){
	}
	
	FlashCard(String question, String answer){
		setAnswer(answer);
		setAnswer(question);
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

}
