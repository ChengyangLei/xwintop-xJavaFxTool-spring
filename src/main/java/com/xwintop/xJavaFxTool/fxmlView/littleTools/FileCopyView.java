package com.xwintop.xJavaFxTool.fxmlView.littleTools;

import de.felixroske.jfxsupport.AbstractFxmlView;
import de.felixroske.jfxsupport.FXMLView;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Scope("prototype")
//@FXMLView(value = "/fxml/littleTools/FileCopy.fxml", bundle = "locale.Menu")
@Lazy
@FXMLView
public class FileCopyView extends AbstractFxmlView {
}
