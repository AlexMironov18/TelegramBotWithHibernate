package com.dexsys.TelegramBotDexsys.domain.services.entities;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@MappedSuperclass
public abstract class EntityWithTimeStamps implements Serializable {

    @CreationTimestamp
    @Column(name = "load_date", updatable = false)
    private LocalDateTime loadDate;

    @UpdateTimestamp
    @Column(name = "update_date")
    private LocalDateTime updateDate;

}
