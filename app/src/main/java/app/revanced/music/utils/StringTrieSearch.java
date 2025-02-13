package app.revanced.music.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.Objects;

/**
 * Text pattern searching using a prefix tree (trie).
 */
public final class StringTrieSearch extends TrieSearch<String> {

    public StringTrieSearch() {
        super(new StringTrieNode());
    }

    @Override
    public void addPattern(@NonNull String pattern) {
        super.addPattern(pattern, pattern.length(), null);
    }

    @Override
    public void addPattern(@NonNull String pattern, @NonNull TriePatternMatchedCallback<String> callback) {
        super.addPattern(pattern, pattern.length(), Objects.requireNonNull(callback));
    }

    @Override
    public boolean matches(@NonNull String textToSearch, int startIndex, int endIndex, @Nullable Object callbackParameter) {
        return super.matches(textToSearch, textToSearch.length(), startIndex, endIndex, callbackParameter);
    }

    @Override
    public boolean matches(@NonNull String textToSearch, @Nullable Object callbackParameter) {
        return matches(textToSearch, 0, textToSearch.length(), callbackParameter);
    }

    @Override
    public boolean matches(@NonNull String textToSearch, int startIndex) {
        return matches(textToSearch, startIndex, textToSearch.length(), null);
    }

    private static final class StringTrieNode extends TrieNode<String> {
        TrieNode<String> createNode() {
            return new StringTrieNode();
        }

        char getCharValue(String text, int index) {
            return text.charAt(index);
        }
    }
}
