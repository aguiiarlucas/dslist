package com.devsuperior.dslist.dto;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.projections.GameMinProjection;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GameMinDTO {

    private Long id;
    private String title;
    @Column(name = "game_year")
    private Integer year;
    private String imgUrl;
    @Column(columnDefinition = "TEXT")
    private String shortDescription;

    public GameMinDTO(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }
    public GameMinDTO(GameMinProjection projection) {
        BeanUtils.copyProperties(projection,this);
    }

}
