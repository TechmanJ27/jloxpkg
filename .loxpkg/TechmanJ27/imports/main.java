

class LoxImport {
  public Integer failed = 0;
  public Integer successful = 0;
  
  Boolean validateFile(String path) {
    File f = new File(path);
    if(f.isFile()) { 
      return true;
    }
    return false;
  }

  Boolean validatePkg(String owner, String name) {
    File f = new File(".loxpkg/" + owner + "/" + name);
    if (f.exists()) {
      return true;
    }
    return false;
  }

  List<LoxFunction> exposedFunctions(String pkg) {
    List<LoxFunction> functions = new ArrayList<>();
    if (!validateFile(pkg) || !validatePkg(pkg.split('/')[0], pkg.split('/')[1])) {
      return functions;
    }
    if (validateFile(pkg) {
      genAst(pkg);
    }
    genAst();
  }

  List<Expr> exposedValues(String pkg) {
      if
  }
}
