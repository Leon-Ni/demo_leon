package entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import entity.annotation.ColumnAlias;
import org.hibernate.annotations.Nationalized;


@Entity
@Table(name = "TAXIC_OI_DOC_DETAIL", indexes = {
		@javax.persistence.Index(columnList = "danjh,hangh", name = "IDX_TAXIC_OI_DOC_DETAIL_fapid"),
		@javax.persistence.Index(columnList = "fapdm,faphm", name = "IDX_TAXIC_OI_DOC_DETAIL_fapdmhm"),
		@javax.persistence.Index(columnList = "docID", name = "IDX_TAXIC_OI_DOC_DETAIL_docid"),
		@javax.persistence.Index(columnList = "ID", name = "IDX_TAXIC_OI_DOC_DETAIL_danjh", unique = true) })
public class DocDetail extends EntityDeepCopy
{
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id", unique = true, nullable = false, precision = 20, scale = 0)
	private long id;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "docID", nullable = false)
	private Doc doc;
	@ColumnAlias("单据号")
	@Column(name = "danjh", length = 60, nullable = false)
	private String danjh;
	@ColumnAlias("发票代码")
	@Column(name = "fapdm", length = 15, nullable = true)
	private String fapdm;
	@ColumnAlias("发票号码")
	@Column(name = "faphm", length = 10, nullable = true)
	private String faphm;
	@ColumnAlias("行号")
	@Column(name = "hangh", precision = 12, nullable = false)
	private long hangh;
	@ColumnAlias("商品编号")
	@Column(name = "shangpbh", length = 60, nullable = true)
	private String shangpbh;
	@ColumnAlias("商品名称")
	@Nationalized
	@Column(name = "shangpmc", length = 100, nullable = false)
	private String shangpmc;
	@ColumnAlias("商品英文名称")
	@Column(name = "shangpywmc", length = 100, nullable = true)
	private String shangpywmc;
	@ColumnAlias("税收编码")
	@Nationalized
	@Column(name = "shuisbm", length = 50, nullable = false)
	private String shuisbm;
	@ColumnAlias("规格型号")
	@Nationalized
	@Column(name = "guigxh", length = 100, nullable = true)
	private String guigxh;
	@ColumnAlias("单位")
	@Nationalized
	@Column(name = "danw", length = 25, nullable = true)
	private String danw;
	@ColumnAlias("单价")
	@Column(name = "danj", length = 25, nullable = true)
	private String danj = "0";
	@ColumnAlias("数量")
	@Column(name = "shul", length = 20, nullable = true)
	private String shul = "0";
	@ColumnAlias("金额")
	@Column(name = "jine", precision = 20, scale = 2, nullable = true)
	private BigDecimal jine = new BigDecimal(0);
	@ColumnAlias("折扣率")
	@Column(name = "zhekl", length = 20, nullable = true)
	private String zhekl = "0";
	@ColumnAlias("折扣金额")
	@Column(name = "zkjine", precision = 20, scale = 2, nullable = true)
	private BigDecimal zkjine = new BigDecimal(0);
	@ColumnAlias("折扣税额")
	@Column(name = "zkshuie", precision = 20, scale = 2, nullable = true)
	private BigDecimal zkshuie = new BigDecimal(0);
	@ColumnAlias("税目")
	@Nationalized
	@Column(name = "shuimu", length = 20, nullable = true)
	private String shuimu;
	@ColumnAlias("税率")
	@Column(name = "shuil", length = 20, nullable = true)
	private String shuil = "0";
	@ColumnAlias("税额")
	@Column(name = "shuie", precision = 20, scale = 2, nullable = true)
	private BigDecimal shuie = new BigDecimal(0);
	@ColumnAlias("税收优惠政策标志")
	@Column(name = "syyhzcbz", length = 1, nullable = true)
	private String syyhzcbz;
	@ColumnAlias("税收优惠政策说明")
	@Nationalized
	@Column(name = "yhzcsm", length = 50, nullable = true)
	private String yhzcsm;
	@ColumnAlias("零税率标志")
	@Column(name = "lslbz", length = 1, nullable = true)
	private String lslbz;
	@ColumnAlias("是否有清单")
	@Column(name = "qingd", length = 1, nullable = true)
	private String qingd;
	@ColumnAlias("参考字段1")
	@Nationalized
	@Column(name = "cank1", length = 50, nullable = true)
	private String cank1;
	@ColumnAlias("参考字段2")
	@Nationalized
	@Column(name = "cank2", length = 50, nullable = true)
	private String cank2;
	@ColumnAlias("参考字段3")
  @Nationalized
	@Column(name = "cank3", length = 50, nullable = true)
	private String cank3;
	@ColumnAlias("参考字段4")
  @Nationalized
	@Column(name = "cank4", length = 50, nullable = true)
	private String cank4;
	@ColumnAlias("参考字段5")
  @Nationalized
	@Column(name = "cank5", length = 50, nullable = true)
	private String cank5;
  
  public long getId()
  {
    return this.id;
  }
  
  public void setId(long id)
  {
    this.id = id;
  }
  
	public String getDanjh() {
		return this.danjh;
	}

	public void setDanjh(String danjh) {
		this.danjh = danjh;
	}

	public String getFapdm() {
		return this.fapdm;
	}

	public void setFapdm(String fapdm) {
		this.fapdm = fapdm;
	}

	public String getFaphm() {
		return this.faphm;
	}

	public void setFaphm(String faphm) {
		this.faphm = faphm;
	}

	public long getHangh() {
		return this.hangh;
	}

	public void setHangh(long hangh) {
		this.hangh = hangh;
	}

	public String getShangpbh() {
		return this.shangpbh;
	}

	public void setShangpbh(String shangpbh) {
		this.shangpbh = shangpbh;
	}

	public String getShangpmc() {
		return this.shangpmc;
	}

	public void setShangpmc(String shangpmc) {
		this.shangpmc = shangpmc;
	}

	public String getShangpywmc() {
		return this.shangpywmc;
	}

	public void setShangpywmc(String shangpywmc) {
		this.shangpywmc = shangpywmc;
	}

	public String getShuisbm() {
		return this.shuisbm;
	}

	public void setShuisbm(String shuisbm) {
		this.shuisbm = shuisbm;
	}

	public String getGuigxh() {
		return this.guigxh;
	}

	public void setGuigxh(String guigxh) {
		this.guigxh = guigxh;
	}

	public String getDanw() {
		return this.danw;
	}

	public void setDanw(String danw) {
		this.danw = danw;
	}

	public String getDanj() {
		return this.danj;
	}

	public void setDanj(String danj) {
		this.danj = danj;
	}

	public String getShuimu() {
		return this.shuimu;
	}

	public void setShuimu(String shuimu) {
		this.shuimu = shuimu;
	}

	public String getShul() {
		return this.shul;
	}

	public void setShul(String shul)
  {
		this.shul = shul;
  }
  
	public BigDecimal getJine()
  {
		return this.jine;
  }
  
	public void setJine(BigDecimal jine)
  {
		this.jine = jine;
  }
  
	public String getShuil()
  {
		return this.shuil;
  }
  
	public void setShuil(String shuil)
  {
		this.shuil = shuil;
  }
  
	public BigDecimal getShuie()
  {
		return this.shuie;
  }
  
	public void setShuie(BigDecimal shuie)
  {
		this.shuie = shuie;
  }
  
	public String getQingd()
  {
		return this.qingd;
  }
  
	public void setQingd(String qingd)
  {
		this.qingd = qingd;
  }
  
	public Doc getDoc()
  {
		return this.doc;
  }
  
	public void setDoc(Doc doc)
  {
		this.doc = doc;
  }
  
	public String getZhekl()
  {
		return this.zhekl;
  }
  
	public void setZhekl(String zhekl)
  {
		this.zhekl = zhekl;
  }
  
	public BigDecimal getZkjine() {
		return this.zkjine;
	}
  
	public void setZkjine(BigDecimal zkjine)
  {
		this.zkjine = zkjine;
  }
  
	public BigDecimal getZkshuie()
  {
		return this.zkshuie;
  }
  
	public void setZkshuie(BigDecimal zkshuie)
  {
		this.zkshuie = zkshuie;
  }
  
	public String getSyyhzcbz()
  {
		return this.syyhzcbz;
  }
  
	public void setSyyhzcbz(String syyhzcbz)
  {
		this.syyhzcbz = syyhzcbz;
  }
  
	public String getYhzcsm()
  {
		return this.yhzcsm;
  }
  
	public void setYhzcsm(String yhzcsm)
  {
		this.yhzcsm = yhzcsm;
  }
  
	public String getLslbz()
  {
		return this.lslbz;
  }
  
	public void setLslbz(String lslbz)
  {
		this.lslbz = lslbz;
  }
  
	public String getCank1()
  {
		return this.cank1;
  }
  
	public void setCank1(String cank1)
  {
		this.cank1 = cank1;
  }
  
	public String getCank2()
  {
		return this.cank2;
  }
  
	public void setCank2(String cank2)
  {
		this.cank2 = cank2;
  }
  
	public String getCank3()
  {
		return this.cank3;
  }
  
	public void setCank3(String cank3)
  {
		this.cank3 = cank3;
  }
  
	public String getCank4()
  {
		return this.cank4;
  }
  
	public void setCank4(String cank4)
  {
		this.cank4 = cank4;
  }
  
	public String getCank5()
  {
		return this.cank5;
  }
  
	public void setCank5(String cank5)
  {
		this.cank5 = cank5;
  }
}
