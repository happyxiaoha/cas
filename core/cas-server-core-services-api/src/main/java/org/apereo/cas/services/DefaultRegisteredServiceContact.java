package org.apereo.cas.services;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Travis Schmidt
 * @since 5.2
 */
@Entity
@Table(name = "RegisteredServiceImplContact")
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS)
@ToString
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class DefaultRegisteredServiceContact implements RegisteredServiceContact {

    private static final long serialVersionUID = 1324660891900737066L;

    @org.springframework.data.annotation.Id
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;

    @Column(nullable = false)
    private String name;

    @Column
    private String email;

    @Column
    private String phone;

    @Column
    private String department;

}
