package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mouse database table.
 * 
 */
@Entity
@NamedQuery(name="Mouse.findAll", query="SELECT m FROM Mouse m")
public class Mouse implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="mouse_id")
	private int mouseId;

	private String color;

	@Column(name="connection_type")
	private String connectionType;

	@Column(name="hand_orientation")
	private String handOrientation;

	@Column(name="maximum_dpi")
	private short maximumDpi;

	@Column(name="tracking_method")
	private String trackingMethod;

	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;

	public Mouse() {
	}

	public int getMouseId() {
		return this.mouseId;
	}

	public void setMouseId(int mouseId) {
		this.mouseId = mouseId;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getConnectionType() {
		return this.connectionType;
	}

	public void setConnectionType(String connectionType) {
		this.connectionType = connectionType;
	}

	public String getHandOrientation() {
		return this.handOrientation;
	}

	public void setHandOrientation(String handOrientation) {
		this.handOrientation = handOrientation;
	}

	public short getMaximumDpi() {
		return this.maximumDpi;
	}

	public void setMaximumDpi(short maximumDpi) {
		this.maximumDpi = maximumDpi;
	}

	public String getTrackingMethod() {
		return this.trackingMethod;
	}

	public void setTrackingMethod(String trackingMethod) {
		this.trackingMethod = trackingMethod;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}