package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the keyboard database table.
 * 
 */
@Entity
@NamedQuery(name="Keyboard.findAll", query="SELECT k FROM Keyboard k")
public class Keyboard implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="keyboard_id")
	private int keyboardId;

	private String backlit;

	private String color;

	@Column(name="connection_type")
	private String connectionType;

	private String style;

	@Column(name="switch_type")
	private String switchType;

	private String tenkeyless;

	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;

	public Keyboard() {
	}

	public int getKeyboardId() {
		return this.keyboardId;
	}

	public void setKeyboardId(int keyboardId) {
		this.keyboardId = keyboardId;
	}

	public String getBacklit() {
		return this.backlit;
	}

	public void setBacklit(String backlit) {
		this.backlit = backlit;
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

	public String getStyle() {
		return this.style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getSwitchType() {
		return this.switchType;
	}

	public void setSwitchType(String switchType) {
		this.switchType = switchType;
	}

	public String getTenkeyless() {
		return this.tenkeyless;
	}

	public void setTenkeyless(String tenkeyless) {
		this.tenkeyless = tenkeyless;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}