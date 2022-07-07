package de.neuefische.cgnjava222.guestlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

public class GuestlistTest {

    @Test
    void shouldBeEmptyInitially() {
        Guestlist guestlist = new Guestlist();
        List<String> actual = guestlist.getGuests();
        Assertions.assertEquals(Collections.emptyList(), actual);
    }

    @Test
    void shouldReadSameGuestsAsWrittenBefore() {
        Guestlist guestlist = new Guestlist();
        guestlist.setGuests(List.of("Karl", "Ute"));
        List<String> actual = guestlist.getGuests();
        Assertions.assertEquals(List.of("Karl", "Ute"), actual);
    }
}
