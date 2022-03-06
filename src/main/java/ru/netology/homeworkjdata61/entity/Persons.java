package ru.netology.homeworkjdata61.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Persons {
    @EmbeddedId
    private Contact contact;

    @Column(length = 16)
    private String phoneNumber;

    @Column(nullable = false, length = 20)
    private String cityOfLiving;
}
