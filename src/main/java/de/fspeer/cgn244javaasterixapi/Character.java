package de.fspeer.cgn244javaasterixapi;


import org.springframework.data.annotation.Id;

public record Character(
        String id,
        String name,
        int age,
        String profession
) {
}
