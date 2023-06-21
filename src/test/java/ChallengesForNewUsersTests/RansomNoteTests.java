package ChallengesForNewUsersTests;

import org.example.ChallengesForNewUsers.RansomNote;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RansomNoteTests {

    @Test
    void canConstruct_EmptyStrings_True() {
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
    void canConstruct_SameLettersEqualLength_True() {
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
    void canConstruct_ShortNoteFromLongMagazine_True() {
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
    void canConstruct_LongNoteFromShortMagazine_False() {
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
