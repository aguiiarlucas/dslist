package com.devsuperior.dslist.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_belonging")
@Embeddable
public class Belonging {

    @EmbeddedId
    private BelongingPK id =new BelongingPK();
    @Column(insertable=false, updatable=false)
    private Integer position;
    public Belonging(Game game , GameList list, Integer position){
        id.setGame(game);
        id.setList(list);
        this.position=position;
    }
}
