package bayern.steinbrecher.stonebill.elements;

import bayern.steinbrecher.checkedElements.CheckableControlBase;
import bayern.steinbrecher.checkedElements.CheckedControl;
import bayern.steinbrecher.checkedElements.report.ReportEntry;
import bayern.steinbrecher.stonebill.data.Address;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.ReadOnlyBooleanProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ObservableBooleanValue;
import javafx.collections.ObservableList;
import javafx.scene.control.Control;
import lombok.NonNull;

import java.util.logging.Level;
import java.util.logging.Logger;

public class AddressField extends Control implements CheckedControl {
    private static final Logger LOGGER = Logger.getLogger(AddressField.class.getName());
    private final CheckableControlBase<AddressField> ccBase = new CheckableControlBase<>(this);
    private final ObjectProperty<Address> address = new SimpleObjectProperty<>();

    public AddressField() {
        skinProperty().addListener((obs, oldSkin, newSkin) -> {
            if (newSkin != null) {
                if (newSkin instanceof AddressFieldSkin) {
                    // TODO Bidirectionally attach skin properties to address property
                } else {
                    LOGGER.log(Level.SEVERE,
                            String.format("The currently set skin (%s) is not supported",
                                    newSkin.getClass().getName()));
                }
            }
        });
    }

    public ObjectProperty<Address> addressProperty() {
        return address;
    }

    public Address getAddress() {
        return addressProperty().get();
    }

    public void setAddress(Address address) {
        addressProperty().set(address);
    }

    @Override
    public ReadOnlyBooleanProperty validProperty() {
        return ccBase.validProperty();
    }

    @Override
    public boolean addValidityConstraint(@NonNull ObservableBooleanValue constraint) {
        return ccBase.addValidityConstraint(constraint);
    }

    @Override
    public ObservableList<ReportEntry> getReports() {
        return ccBase.getReports();
    }

    @Override
    public boolean addReport(@NonNull ReportEntry report) {
        return ccBase.addReport(report);
    }

    @Override
    public ReadOnlyBooleanProperty checkedProperty() {
        return ccBase.checkedProperty();
    }
}
