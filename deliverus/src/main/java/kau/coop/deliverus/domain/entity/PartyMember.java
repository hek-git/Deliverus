package kau.coop.deliverus.domain.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PartyMember {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long partyMemberId;
    private String nickname;

    @ManyToOne
    @JoinColumn(name="partyId")
    private Party party;

    @ElementCollection
    @CollectionTable(
            name="\"order\"",
            joinColumns = @JoinColumn(name = "partyMemberId")
    )
    private List<Order> order;

    public void setParty(Party party){
        this.party=party;
    }

}
