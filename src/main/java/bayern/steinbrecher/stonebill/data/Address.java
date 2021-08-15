package bayern.steinbrecher.stonebill.data;

import lombok.NonNull;

public record Address(
        @NonNull String firstname,
        @NonNull String lastname,
        @NonNull String street,
        @NonNull String houseNumber,
        @NonNull String postalCode,
        @NonNull String city) {
}
