package cwl;
/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class CommandOutputArraySchema extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CommandOutputArraySchema\",\"fields\":[{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"Array_symbol\",\"symbols\":[\"array\"]},\"doc\":\"Must be `array`\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\"},\"inherited_from\":\"https://w3id.org/cwl/salad#ArraySchema\"},{\"name\":\"items\",\"type\":[{\"type\":\"enum\",\"name\":\"PrimitiveType\",\"symbols\":[\"null\",\"boolean\",\"int\",\"long\",\"float\",\"double\",\"string\"]},{\"type\":\"record\",\"name\":\"CommandOutputRecordSchema\",\"fields\":[{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"Record_symbol\",\"symbols\":[\"record\"]},\"doc\":\"Must be `record`\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\"},\"inherited_from\":\"https://w3id.org/cwl/salad#RecordSchema\"},{\"name\":\"fields\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"CommandOutputRecordField\",\"fields\":[{\"name\":\"type\",\"type\":\"Record_symbol\",\"doc\":\"Must be `record`\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\"},\"inherited_from\":\"https://w3id.org/cwl/salad#RecordSchema\"},{\"name\":\"fields\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"RecordField\",\"doc\":\"A field of a record.\",\"fields\":[{\"name\":\"name\",\"type\":\"string\",\"doc\":\"The name of the field\\n\",\"jsonldPredicate\":\"@id\"},{\"name\":\"doc\",\"type\":[\"null\",\"string\"],\"doc\":\"A documentation string for this field\\n\",\"jsonldPredicate\":\"sld:doc\"},{\"name\":\"type\",\"type\":[\"PrimitiveType\",{\"type\":\"record\",\"name\":\"RecordSchema\",\"fields\":[{\"name\":\"type\",\"type\":\"Record_symbol\",\"doc\":\"Must be `record`\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\"}},{\"name\":\"fields\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"RecordField\"}],\"doc\":\"Defines the fields of the record.\",\"jsonldPredicate\":\"sld:fields\"}]},{\"type\":\"record\",\"name\":\"EnumSchema\",\"doc\":\"Define an enumerated type.\\n\",\"fields\":[{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"Enum_symbol\",\"symbols\":[\"enum\"]},\"doc\":\"Must be `enum`\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\"}},{\"name\":\"symbols\",\"type\":[{\"type\":\"array\",\"items\":\"string\"}],\"doc\":\"Defines the set of valid symbols.\",\"jsonldPredicate\":{\"_type\":\"@id\",\"_id\":\"https://w3id.org/cwl/salad#symbols\",\"identity\":true}}]},{\"type\":\"record\",\"name\":\"ArraySchema\",\"fields\":[{\"name\":\"type\",\"type\":\"Array_symbol\",\"doc\":\"Must be `array`\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\"}},{\"name\":\"items\",\"type\":[\"PrimitiveType\",\"RecordSchema\",\"EnumSchema\",\"ArraySchema\",\"string\",{\"type\":\"array\",\"items\":[\"PrimitiveType\",\"RecordSchema\",\"EnumSchema\",\"ArraySchema\",\"string\"]}],\"doc\":\"Defines the type of the array elements.\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#items\"}}]},\"string\",{\"type\":\"array\",\"items\":[\"PrimitiveType\",\"RecordSchema\",\"EnumSchema\",\"ArraySchema\",\"string\"]}],\"doc\":\"The field type\\n\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\"}}]}}],\"doc\":\"Defines the fields of the record.\",\"jsonldPredicate\":\"sld:fields\",\"inherited_from\":\"https://w3id.org/cwl/salad#RecordSchema\"},{\"name\":\"outputBinding\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"CommandOutputBinding\",\"doc\":\"Describes how to generate an output parameter based on the files produced\\nby a CommandLineTool.\\n\\nThe output parameter is generated by applying these operations in\\nthe following order:\\n\\n  - glob\\n  - loadContents\\n  - outputEval\\n\",\"fields\":[{\"name\":\"loadContents\",\"type\":[\"null\",\"boolean\"],\"doc\":\"Only applies when `type` is `File`.  Read up to the first 64 KiB of text from the file and place it in the\\n\\\"contents\\\" field of the file object for manipulation by expressions.\\n\",\"inherited_from\":\"https://w3id.org/cwl/cwl#Binding\"},{\"name\":\"secondaryFiles\",\"type\":[\"null\",\"string\",{\"type\":\"enum\",\"name\":\"Expression\",\"doc\":\"Not a real type.  Indicates that a field must allow expressions.\\n\",\"symbols\":[\"ExpressionPlaceholder\"]},{\"type\":\"array\",\"items\":[\"string\",\"Expression\"]}],\"doc\":\"Only applies when `type` is `File`.  Describes files that must be\\nincluded alongside the primary file.\\n\\nIf the value is an expression, the context of the expression is the input\\nor output File parameter to which this binding applies.\\n\\nIf the value is a string, it specifies that the following pattern\\nshould be applied to the primary file:\\n\\n  1. If string begins with one or more caret `^` characters, for each\\n    caret, remove the last file extension from the path (the last\\n    period `.` and all following characters).  If there are no file\\n    extensions, the path is unchanged.\\n  2. Append the remainder of the string to the end of the file path.\\n\",\"jsonldPredicate\":\"cwl:secondaryFiles\",\"inherited_from\":\"https://w3id.org/cwl/cwl#Binding\"},{\"name\":\"glob\",\"type\":[\"null\",\"string\",\"Expression\",{\"type\":\"array\",\"items\":\"string\"}],\"doc\":\"Find files relative to the output directory, using POSIX glob(3)\\npathname matching.  If provided an array, find files that match any\\npattern in the array.  If provided an expression, the expression must\\nreturn a string or an array of strings, which will then be evaluated as\\none or more glob patterns.  Only files which actually exist will be\\nmatched and returned.\\n\"},{\"name\":\"outputEval\",\"type\":[\"null\",\"string\",\"Expression\"],\"doc\":\"Evaluate an expression to generate the output value.  If `glob` was\\nspecified, the script `context` will be an array containing any files that were\\nmatched.  Additionally, if `loadContents` is `true`, the File objects\\nwill include up to the first 64 KiB of file contents in the `contents` field.\\n\"}],\"extends\":\"https://w3id.org/cwl/cwl#Binding\"}],\"jsonldPredicate\":\"cwl:outputBinding\",\"inherited_from\":\"https://w3id.org/cwl/cwl#OutputRecordField\"}],\"extends\":\"https://w3id.org/cwl/cwl#OutputRecordField\",\"specialize\":[{\"specializeFrom\":\"https://w3id.org/cwl/cwl#OutputRecordSchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandOutputRecordSchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/cwl#OutputEnumSchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandOutputEnumSchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/cwl#OutputArraySchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandOutputArraySchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/cwl#Binding\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandOutputBinding\"}]}}],\"doc\":\"Defines the fields of the record.\",\"jsonldPredicate\":\"sld:fields\",\"inherited_from\":\"https://w3id.org/cwl/salad#RecordSchema\"}],\"extends\":\"https://w3id.org/cwl/cwl#OutputRecordSchema\",\"specialize\":[{\"specializeFrom\":\"https://w3id.org/cwl/cwl#OutputRecordField\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandOutputRecordField\"}]},{\"type\":\"record\",\"name\":\"CommandOutputEnumSchema\",\"fields\":[{\"name\":\"type\",\"type\":\"Enum_symbol\",\"doc\":\"Must be `enum`\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\"},\"inherited_from\":\"https://w3id.org/cwl/salad#EnumSchema\"},{\"name\":\"symbols\",\"type\":[{\"type\":\"array\",\"items\":\"string\"}],\"doc\":\"Defines the set of valid symbols.\",\"jsonldPredicate\":{\"_type\":\"@id\",\"_id\":\"https://w3id.org/cwl/salad#symbols\",\"identity\":true},\"inherited_from\":\"https://w3id.org/cwl/salad#EnumSchema\"},{\"name\":\"outputBinding\",\"type\":[\"null\",\"CommandOutputBinding\"],\"jsonldPredicate\":\"cwl:outputBinding\",\"inherited_from\":\"https://w3id.org/cwl/cwl#OutputEnumSchema\"}],\"extends\":\"https://w3id.org/cwl/cwl#OutputEnumSchema\",\"specialize\":[{\"specializeFrom\":\"https://w3id.org/cwl/cwl#OutputRecordSchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandOutputRecordSchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/cwl#OutputEnumSchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandOutputEnumSchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/cwl#OutputArraySchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandOutputArraySchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/cwl#Binding\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandOutputBinding\"}]},\"CommandOutputArraySchema\",\"string\",{\"type\":\"array\",\"items\":[\"PrimitiveType\",\"CommandOutputRecordSchema\",\"CommandOutputEnumSchema\",\"CommandOutputArraySchema\",\"string\"]}],\"doc\":\"Defines the type of the array elements.\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#items\"},\"inherited_from","\":\"https://w3id.org/cwl/salad#ArraySchema\"},{\"name\":\"outputBinding\",\"type\":[\"null\",\"CommandOutputBinding\"],\"jsonldPredicate\":\"cwl:outputBinding\",\"inherited_from\":\"https://w3id.org/cwl/cwl#OutputArraySchema\"}],\"extends\":\"https://w3id.org/cwl/cwl#OutputArraySchema\",\"specialize\":[{\"specializeFrom\":\"https://w3id.org/cwl/cwl#OutputRecordSchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandOutputRecordSchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/cwl#OutputEnumSchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandOutputEnumSchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/cwl#OutputArraySchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandOutputArraySchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/cwl#Binding\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandOutputBinding\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** Must be `array` */
  @Deprecated public Array_symbol type;
  /** Defines the type of the array elements. */
  @Deprecated public java.lang.Object items;
  @Deprecated public CommandOutputBinding outputBinding;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public CommandOutputArraySchema() {}

  /**
   * All-args constructor.
   */
  public CommandOutputArraySchema(Array_symbol type, java.lang.Object items, CommandOutputBinding outputBinding) {
    this.type = type;
    this.items = items;
    this.outputBinding = outputBinding;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return type;
    case 1: return items;
    case 2: return outputBinding;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: type = (Array_symbol)value$; break;
    case 1: items = (java.lang.Object)value$; break;
    case 2: outputBinding = (CommandOutputBinding)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'type' field.
   * Must be `array`   */
  public Array_symbol getType() {
    return type;
  }

  /**
   * Sets the value of the 'type' field.
   * Must be `array`   * @param value the value to set.
   */
  public void setType(Array_symbol value) {
    this.type = value;
  }

  /**
   * Gets the value of the 'items' field.
   * Defines the type of the array elements.   */
  public java.lang.Object getItems() {
    return items;
  }

  /**
   * Sets the value of the 'items' field.
   * Defines the type of the array elements.   * @param value the value to set.
   */
  public void setItems(java.lang.Object value) {
    this.items = value;
  }

  /**
   * Gets the value of the 'outputBinding' field.
   */
  public CommandOutputBinding getOutputBinding() {
    return outputBinding;
  }

  /**
   * Sets the value of the 'outputBinding' field.
   * @param value the value to set.
   */
  public void setOutputBinding(CommandOutputBinding value) {
    this.outputBinding = value;
  }

  /** Creates a new CommandOutputArraySchema RecordBuilder */
  public static CommandOutputArraySchema.Builder newBuilder() {
    return new CommandOutputArraySchema.Builder();
  }
  
  /** Creates a new CommandOutputArraySchema RecordBuilder by copying an existing Builder */
  public static CommandOutputArraySchema.Builder newBuilder(CommandOutputArraySchema.Builder other) {
    return new CommandOutputArraySchema.Builder(other);
  }
  
  /** Creates a new CommandOutputArraySchema RecordBuilder by copying an existing CommandOutputArraySchema instance */
  public static CommandOutputArraySchema.Builder newBuilder(CommandOutputArraySchema other) {
    return new CommandOutputArraySchema.Builder(other);
  }
  
  /**
   * RecordBuilder for CommandOutputArraySchema instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CommandOutputArraySchema>
    implements org.apache.avro.data.RecordBuilder<CommandOutputArraySchema> {

    private Array_symbol type;
    private java.lang.Object items;
    private CommandOutputBinding outputBinding;

    /** Creates a new Builder */
    private Builder() {
      super(CommandOutputArraySchema.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(CommandOutputArraySchema.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.items)) {
        this.items = data().deepCopy(fields()[1].schema(), other.items);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.outputBinding)) {
        this.outputBinding = data().deepCopy(fields()[2].schema(), other.outputBinding);
        fieldSetFlags()[2] = true;
      }
    }
    
    /** Creates a Builder by copying an existing CommandOutputArraySchema instance */
    private Builder(CommandOutputArraySchema other) {
            super(CommandOutputArraySchema.SCHEMA$);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.items)) {
        this.items = data().deepCopy(fields()[1].schema(), other.items);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.outputBinding)) {
        this.outputBinding = data().deepCopy(fields()[2].schema(), other.outputBinding);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'type' field */
    public Array_symbol getType() {
      return type;
    }
    
    /** Sets the value of the 'type' field */
    public CommandOutputArraySchema.Builder setType(Array_symbol value) {
      validate(fields()[0], value);
      this.type = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'type' field has been set */
    public boolean hasType() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'type' field */
    public CommandOutputArraySchema.Builder clearType() {
      type = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'items' field */
    public java.lang.Object getItems() {
      return items;
    }
    
    /** Sets the value of the 'items' field */
    public CommandOutputArraySchema.Builder setItems(java.lang.Object value) {
      validate(fields()[1], value);
      this.items = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'items' field has been set */
    public boolean hasItems() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'items' field */
    public CommandOutputArraySchema.Builder clearItems() {
      items = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'outputBinding' field */
    public CommandOutputBinding getOutputBinding() {
      return outputBinding;
    }
    
    /** Sets the value of the 'outputBinding' field */
    public CommandOutputArraySchema.Builder setOutputBinding(CommandOutputBinding value) {
      validate(fields()[2], value);
      this.outputBinding = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'outputBinding' field has been set */
    public boolean hasOutputBinding() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'outputBinding' field */
    public CommandOutputArraySchema.Builder clearOutputBinding() {
      outputBinding = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public CommandOutputArraySchema build() {
      try {
        CommandOutputArraySchema record = new CommandOutputArraySchema();
        record.type = fieldSetFlags()[0] ? this.type : (Array_symbol) defaultValue(fields()[0]);
        record.items = fieldSetFlags()[1] ? this.items : (java.lang.Object) defaultValue(fields()[1]);
        record.outputBinding = fieldSetFlags()[2] ? this.outputBinding : (CommandOutputBinding) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
