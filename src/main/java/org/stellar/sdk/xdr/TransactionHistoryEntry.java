// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.sdk.xdr;


import java.io.IOException;

import com.google.common.base.Objects;

// === xdr source ============================================================

//  struct TransactionHistoryEntry
//  {
//      uint32 ledgerSeq;
//      TransactionSet txSet;
//  
//      // reserved for future use
//      union switch (int v)
//      {
//      case 0:
//          void;
//      }
//      ext;
//  };

//  ===========================================================================
public class TransactionHistoryEntry  {
  public TransactionHistoryEntry () {}
  private Uint32 ledgerSeq;
  public Uint32 getLedgerSeq() {
    return this.ledgerSeq;
  }
  public void setLedgerSeq(Uint32 value) {
    this.ledgerSeq = value;
  }
  private TransactionSet txSet;
  public TransactionSet getTxSet() {
    return this.txSet;
  }
  public void setTxSet(TransactionSet value) {
    this.txSet = value;
  }
  private TransactionHistoryEntryExt ext;
  public TransactionHistoryEntryExt getExt() {
    return this.ext;
  }
  public void setExt(TransactionHistoryEntryExt value) {
    this.ext = value;
  }
  public static void encode(XdrDataOutputStream stream, TransactionHistoryEntry encodedTransactionHistoryEntry) throws IOException{
    Uint32.encode(stream, encodedTransactionHistoryEntry.ledgerSeq);
    TransactionSet.encode(stream, encodedTransactionHistoryEntry.txSet);
    TransactionHistoryEntryExt.encode(stream, encodedTransactionHistoryEntry.ext);
  }
  public static TransactionHistoryEntry decode(XdrDataInputStream stream) throws IOException {
    TransactionHistoryEntry decodedTransactionHistoryEntry = new TransactionHistoryEntry();
    decodedTransactionHistoryEntry.ledgerSeq = Uint32.decode(stream);
    decodedTransactionHistoryEntry.txSet = TransactionSet.decode(stream);
    decodedTransactionHistoryEntry.ext = TransactionHistoryEntryExt.decode(stream);
    return decodedTransactionHistoryEntry;
  }
  @Override
  public int hashCode() {
    return Objects.hashCode(this.ledgerSeq, this.txSet, this.ext);
  }
  @Override
  public boolean equals(Object object) {
    if (object == null || !(object instanceof TransactionHistoryEntry)) {
      return false;
    }

    TransactionHistoryEntry other = (TransactionHistoryEntry) object;
    return Objects.equal(this.ledgerSeq, other.ledgerSeq) && Objects.equal(this.txSet, other.txSet) && Objects.equal(this.ext, other.ext);
  }

  public static class TransactionHistoryEntryExt {
    public TransactionHistoryEntryExt () {}
    Integer v;
    public Integer getDiscriminant() {
      return this.v;
    }
    public void setDiscriminant(Integer value) {
      this.v = value;
    }
    public static void encode(XdrDataOutputStream stream, TransactionHistoryEntryExt encodedTransactionHistoryEntryExt) throws IOException {
    //Xdrgen::AST::Typespecs::Int
    //Integer
    stream.writeInt(encodedTransactionHistoryEntryExt.getDiscriminant().intValue());
    switch (encodedTransactionHistoryEntryExt.getDiscriminant()) {
    case 0:
    break;
    }
    }
    public static TransactionHistoryEntryExt decode(XdrDataInputStream stream) throws IOException {
    TransactionHistoryEntryExt decodedTransactionHistoryEntryExt = new TransactionHistoryEntryExt();
    Integer discriminant = stream.readInt();
    decodedTransactionHistoryEntryExt.setDiscriminant(discriminant);
    switch (decodedTransactionHistoryEntryExt.getDiscriminant()) {
    case 0:
    break;
    }
      return decodedTransactionHistoryEntryExt;
    }
    @Override
    public int hashCode() {
      return Objects.hashCode(this.v);
    }
    @Override
    public boolean equals(Object object) {
      if (object == null || !(object instanceof TransactionHistoryEntryExt)) {
        return false;
      }

      TransactionHistoryEntryExt other = (TransactionHistoryEntryExt) object;
      return Objects.equal(this.v, other.v);
    }

  }
}
