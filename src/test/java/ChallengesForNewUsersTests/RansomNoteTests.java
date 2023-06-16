package ChallengesForNewUsersTests;

import org.example.ChallengesForNewUsers.RansomNote;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RansomNoteTests {

    @Test
    void emptyStrings() {
        String ransomNote = "", magazine = "";

        assertTrue(
                RansomNote.canConstruct(
                        ransomNote,
                        magazine
                )
        );
        assertTrue(
                RansomNote.canConstructBest(
                        ransomNote,
                        magazine
                )
        );
    }

    @Test
    void equalLength() {
        String ransomNote = "bab", magazine = "abb";

        assertTrue(
                RansomNote.canConstruct(
                        ransomNote,
                        magazine
                )
        );
        assertTrue(
                RansomNote.canConstructBest(
                        ransomNote,
                        magazine
                )
        );
    }

    @Test
    void shortNoteFromLongMagazine() {
        String ransomNote = "red", magazine = "direction";

        assertTrue(
                RansomNote.canConstruct(
                        ransomNote,
                        magazine
                )
        );
        assertTrue(
                RansomNote.canConstructBest(
                        ransomNote,
                        magazine
                )
        );
    }

    @Test
    void longNoteFromShortMagazine() {
        String ransomNote = "reed", magazine = "red";

        assertFalse(
                RansomNote.canConstruct(
                        ransomNote,
                        magazine
                )
        );
        assertFalse(
                RansomNote.canConstructBest(
                        ransomNote,
                        magazine
                )
        );
    }
}
