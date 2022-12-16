package zjc.hotelmanagejyc.beans;

import java.util.ArrayList;
import java.util.List;

public class HotelKindList {
    private List<Hotelkind> bookkinds = new ArrayList<>();

    public List<Hotelkind> getBookkinds() {
        return bookkinds;
    }

    public void setBookkinds(List<Hotelkind> bookkinds) {
        this.bookkinds = bookkinds;
    }
}
