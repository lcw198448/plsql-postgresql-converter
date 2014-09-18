package ru.barsopen.plsqlconverter.ast.typed;
public class call_spec implements _baseNode {
  public int _line = -1;
  public int _col = -1;
  public int _tokenStartIndex = -1;
  public int _tokenStopIndex = -1;
  public _baseNode _parent = null;
  public _baseNode _getParent() { return _parent; }
  public void _setParent(_baseNode value) { _parent = value; }
  public void _setBaseNode(_baseNode value) { this._parent = value; }
  public int _getLine() { return _line; }
  public int _getCol() { return _col; }
  public int _getTokenStartIndex() { return _tokenStartIndex; }
  public int _getTokenStopIndex() { return _tokenStopIndex; }
  public call_spec_decl call_spec_decl = null;
  public call_spec_decl get_call_spec_decl() { return this.call_spec_decl; }
  public void set_call_spec_decl(call_spec_decl value) {
    if (this.call_spec_decl != null) { this.call_spec_decl._setParent(null); }
    this.call_spec_decl = value;
    if (this.call_spec_decl != null) { this.call_spec_decl._setParent(this); }
  }

  public void _walk(_visitor visitor) {
    visitor.visit(this);
    if (this.call_spec_decl != null) {
      this.call_spec_decl._walk(visitor);
    }
  }

  public void _replace(_baseNode child, _baseNode replacement) {
    if (this.call_spec_decl == child) {
      this.set_call_spec_decl((ru.barsopen.plsqlconverter.ast.typed.call_spec_decl)replacement);
      return;
    }
    throw new RuntimeException("Failed to replace node: no such node");
  }

  public org.antlr.runtime.tree.Tree unparse() {
    org.antlr.runtime.CommonToken _token = new org.antlr.runtime.CommonToken(ru.barsopen.plsqlconverter.PLSQLPrinter.LANGUAGE_VK);
    _token.setLine(_line);
    _token.setCharPositionInLine(_col);
    _token.setText("LANGUAGE_VK");
    org.antlr.runtime.tree.CommonTree _result = new org.antlr.runtime.tree.CommonTree(_token);
    _result.setTokenStartIndex(_tokenStartIndex);
    _result.setTokenStopIndex(_tokenStopIndex);
    if (call_spec_decl == null) { throw new RuntimeException(); }
    _result.addChild(call_spec_decl.unparse());


    return _result;
  }

}
