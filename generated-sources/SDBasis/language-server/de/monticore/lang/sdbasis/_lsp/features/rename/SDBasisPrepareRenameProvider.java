/* generated by template _lsp.features.rename.PrepareRenameProvider*/

package de.monticore.lang.sdbasis._lsp.features.rename;

import de.mclsg.lsp.features.rename.CommonPrepareRenameProvider;
import de.mclsg.lsp.ISymbolUsageResolutionProvider;
import de.mclsg.lsp.document_management.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class SDBasisPrepareRenameProvider extends CommonPrepareRenameProvider {
  public SDBasisPrepareRenameProvider(DocumentManager documentManager, ISymbolUsageResolutionProvider symbolUsageResolutionProvider) {
    super(documentManager, symbolUsageResolutionProvider);
  }
}