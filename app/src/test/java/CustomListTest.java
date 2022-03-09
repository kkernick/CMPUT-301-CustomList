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
}
