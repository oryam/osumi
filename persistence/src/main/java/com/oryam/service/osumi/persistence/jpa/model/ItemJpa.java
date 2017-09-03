package com.oryam.service.osumi.persistence.jpa.model;
// Generated 7 juil. 2017 12:13:50 by Hibernate Tools 4.3.5.Final

import static javax.persistence.GenerationType.SEQUENCE;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * ItemJpa generated by hbm2java
 */
@Entity
@Table(name = "T_ITEM_APP", uniqueConstraints = @UniqueConstraint(columnNames = "CODE"))
public class ItemJpa implements java.io.Serializable {

    private Long id;
    private String code;
    private String label;
    private BigDecimal value;
    private Integer rank;
    private Boolean active;
    private Date startDate;
    private Date auditTime;

    public ItemJpa() {
    }

    public ItemJpa(String code, String label, BigDecimal value, Boolean active, Date startDate, Date auditTime) {
        this.code = code;
        this.label = label;
        this.value = value;
        this.active = active;
        this.startDate = startDate;
        this.auditTime = auditTime;
    }

    public ItemJpa(String code, String label, BigDecimal value, Integer rank, Boolean active, Date startDate, Date auditTime) {
        this.code = code;
        this.label = label;
        this.value = value;
        this.rank = rank;
        this.active = active;
        this.startDate = startDate;
        this.auditTime = auditTime;
    }

    @SequenceGenerator(name = "com.oryam.service.osumi.persistence.jpa.model.ItemJpaIdGenerator", sequenceName = "S_ITEM_ID")
    @Id
    @GeneratedValue(strategy = SEQUENCE, generator = "com.oryam.service.osumi.persistence.jpa.model.ItemJpaIdGenerator")

    @Column(name = "ID", unique = true, nullable = false, precision = 12, scale = 0)
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "CODE", unique = true, nullable = false, length = 400)
    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Column(name = "LABEL", nullable = false, length = 1020)
    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Column(name = "VALUE", nullable = false, precision = 38, scale = 20)
    public BigDecimal getValue() {
        return this.value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    @Column(name = "RANK", precision = 3, scale = 0)
    public Integer getRank() {
        return this.rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    @Column(name = "ACTIVE", nullable = false, precision = 1, scale = 0)
    public Boolean isActive() {
        return this.active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "START_DATE", nullable = false, length = 7)
    public Date getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "AUDIT_TIME", nullable = false)
    public Date getAuditTime() {
        return this.auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

}
