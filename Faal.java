import com.fasterxml.jackson.annotation.JsonProperty;

public class Faal {
    @JsonProperty("Poem")
    private String Poem;

    @JsonProperty("Interpretation")
    private String Interpretation;

    public String getPoem() {
        return this.Poem;
    }

    public String getInterpretation() {
        return Interpretation;
    }

    public void setPoem(String poem) {
        Poem = poem;
    }

    public void setInterpretation(String interpretation) {
        Interpretation = interpretation;
    }
}
