import org.junit.Before;
import org.junit.Test;

public class CustomListTest {

    private CustomList list;

    @Before
    public void createList() {
        list = new CustomList(null, ArrayList<City>());_
    }

    @Test
    public void addCityTest() {
        int listSize = list.getCount();
        list.addCity(new City("Halifax", "NS"));
        assert(list.getCount(), listSize + 1);
    }

    @Test
    public void hasCity() {
        list.addCity(new City("Test", "TE"));
        assert(list.contains(new City("Test", "TE")));
    }
}
