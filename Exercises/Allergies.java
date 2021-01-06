import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Allergies {

  private final List<Allergen> allergens;

  public Allergies(Integer score) {
    allergens = Arrays.stream(Allergen.values())
        .filter(allergen -> (allergen.getScore() & score) == allergen.getScore())
        .collect(Collectors.toList());
  }

  public boolean isAllergicTo(Allergen allergen) {
    return allergens.contains(allergen);
  }

  public List<Allergen> getList() {
    return allergens;
  }
}