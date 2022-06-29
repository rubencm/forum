package net.rubencm.forum.forumsservice.domain.valueobjects;

import lombok.NonNull;
import lombok.Value;

@Value
public class ForumDescription {
    String value;

    public ForumDescription(@NonNull String value) {
        this.validateLength(value);
        this.value = value;
    }

    ForumDescription() {
        this.value = null;
    }

    public @NonNull String value() {
        return this.value;
    }

    private void validateLength(String value) {
        Integer length = value.length();
        if (length > 255) {
            throw new IllegalArgumentException("Value must have a max length of 255 characters.");
        }
    }
}
