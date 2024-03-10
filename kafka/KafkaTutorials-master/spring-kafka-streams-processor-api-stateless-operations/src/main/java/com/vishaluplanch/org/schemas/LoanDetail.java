/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.vishaluplanch.org.schemas;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class LoanDetail extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -1751635284237579377L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"LoanDetail\",\"namespace\":\"com.vishaluplanch.org.schemas\",\"fields\":[{\"name\":\"applicantDetail\",\"type\":{\"type\":\"record\",\"name\":\"ApplicantDetail\",\"fields\":[{\"name\":\"age\",\"type\":\"int\"},{\"name\":\"currentAddress\",\"type\":\"string\"},{\"name\":\"dateOfBirth\",\"type\":\"string\"},{\"name\":\"employmentDetail\",\"type\":{\"type\":\"record\",\"name\":\"EmploymentDetail\",\"fields\":[{\"name\":\"address\",\"type\":\"string\"},{\"name\":\"employmentType\",\"type\":\"string\"},{\"name\":\"inHandSalary\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"}},{\"name\":\"location\",\"type\":\"string\"},{\"name\":\"netSalary\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"}},{\"name\":\"organizationName\",\"type\":\"string\"},{\"name\":\"position\",\"type\":\"string\"}]}},{\"name\":\"firstName\",\"type\":\"string\"},{\"name\":\"lastName\",\"type\":\"string\"},{\"name\":\"middleName\",\"type\":\"string\"},{\"name\":\"permanentAddress\",\"type\":\"string\"}]}},{\"name\":\"approvedLoanAmount\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"}},{\"name\":\"bankName\",\"type\":\"string\"},{\"name\":\"branch\",\"type\":\"string\"},{\"name\":\"branchAddress\",\"type\":\"string\"},{\"name\":\"collateralDetail\",\"type\":{\"type\":\"record\",\"name\":\"CollateralDetail\",\"fields\":[{\"name\":\"collateralDesc\",\"type\":\"string\"},{\"name\":\"collateralId\",\"type\":\"long\"},{\"name\":\"collateralType\",\"type\":\"string\"},{\"name\":\"collateralValue\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"}}]}},{\"name\":\"loanAccountNum\",\"type\":\"long\"},{\"name\":\"loanApprovalDate\",\"type\":\"string\"},{\"name\":\"loanId\",\"type\":\"long\"},{\"name\":\"micrCode\",\"type\":\"string\"},{\"name\":\"requestedLoanAmount\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<LoanDetail> ENCODER =
      new BinaryMessageEncoder<LoanDetail>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<LoanDetail> DECODER =
      new BinaryMessageDecoder<LoanDetail>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<LoanDetail> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<LoanDetail> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<LoanDetail>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this LoanDetail to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a LoanDetail from a ByteBuffer. */
  public static LoanDetail fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public com.vishaluplanch.org.schemas.ApplicantDetail applicantDetail;
  @Deprecated public java.math.BigDecimal approvedLoanAmount;
  @Deprecated public java.lang.CharSequence bankName;
  @Deprecated public java.lang.CharSequence branch;
  @Deprecated public java.lang.CharSequence branchAddress;
  @Deprecated public com.vishaluplanch.org.schemas.CollateralDetail collateralDetail;
  @Deprecated public long loanAccountNum;
  @Deprecated public java.lang.CharSequence loanApprovalDate;
  @Deprecated public long loanId;
  @Deprecated public java.lang.CharSequence micrCode;
  @Deprecated public java.math.BigDecimal requestedLoanAmount;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public LoanDetail() {}

  /**
   * All-args constructor.
   * @param applicantDetail The new value for applicantDetail
   * @param approvedLoanAmount The new value for approvedLoanAmount
   * @param bankName The new value for bankName
   * @param branch The new value for branch
   * @param branchAddress The new value for branchAddress
   * @param collateralDetail The new value for collateralDetail
   * @param loanAccountNum The new value for loanAccountNum
   * @param loanApprovalDate The new value for loanApprovalDate
   * @param loanId The new value for loanId
   * @param micrCode The new value for micrCode
   * @param requestedLoanAmount The new value for requestedLoanAmount
   */
  public LoanDetail(com.vishaluplanch.org.schemas.ApplicantDetail applicantDetail, java.math.BigDecimal approvedLoanAmount, java.lang.CharSequence bankName, java.lang.CharSequence branch, java.lang.CharSequence branchAddress, com.vishaluplanch.org.schemas.CollateralDetail collateralDetail, java.lang.Long loanAccountNum, java.lang.CharSequence loanApprovalDate, java.lang.Long loanId, java.lang.CharSequence micrCode, java.math.BigDecimal requestedLoanAmount) {
    this.applicantDetail = applicantDetail;
    this.approvedLoanAmount = approvedLoanAmount;
    this.bankName = bankName;
    this.branch = branch;
    this.branchAddress = branchAddress;
    this.collateralDetail = collateralDetail;
    this.loanAccountNum = loanAccountNum;
    this.loanApprovalDate = loanApprovalDate;
    this.loanId = loanId;
    this.micrCode = micrCode;
    this.requestedLoanAmount = requestedLoanAmount;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return applicantDetail;
    case 1: return approvedLoanAmount;
    case 2: return bankName;
    case 3: return branch;
    case 4: return branchAddress;
    case 5: return collateralDetail;
    case 6: return loanAccountNum;
    case 7: return loanApprovalDate;
    case 8: return loanId;
    case 9: return micrCode;
    case 10: return requestedLoanAmount;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: applicantDetail = (com.vishaluplanch.org.schemas.ApplicantDetail)value$; break;
    case 1: approvedLoanAmount = (java.math.BigDecimal)value$; break;
    case 2: bankName = (java.lang.CharSequence)value$; break;
    case 3: branch = (java.lang.CharSequence)value$; break;
    case 4: branchAddress = (java.lang.CharSequence)value$; break;
    case 5: collateralDetail = (com.vishaluplanch.org.schemas.CollateralDetail)value$; break;
    case 6: loanAccountNum = (java.lang.Long)value$; break;
    case 7: loanApprovalDate = (java.lang.CharSequence)value$; break;
    case 8: loanId = (java.lang.Long)value$; break;
    case 9: micrCode = (java.lang.CharSequence)value$; break;
    case 10: requestedLoanAmount = (java.math.BigDecimal)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'applicantDetail' field.
   * @return The value of the 'applicantDetail' field.
   */
  public com.vishaluplanch.org.schemas.ApplicantDetail getApplicantDetail() {
    return applicantDetail;
  }

  /**
   * Sets the value of the 'applicantDetail' field.
   * @param value the value to set.
   */
  public void setApplicantDetail(com.vishaluplanch.org.schemas.ApplicantDetail value) {
    this.applicantDetail = value;
  }

  /**
   * Gets the value of the 'approvedLoanAmount' field.
   * @return The value of the 'approvedLoanAmount' field.
   */
  public java.math.BigDecimal getApprovedLoanAmount() {
    return approvedLoanAmount;
  }

  /**
   * Sets the value of the 'approvedLoanAmount' field.
   * @param value the value to set.
   */
  public void setApprovedLoanAmount(java.math.BigDecimal value) {
    this.approvedLoanAmount = value;
  }

  /**
   * Gets the value of the 'bankName' field.
   * @return The value of the 'bankName' field.
   */
  public java.lang.CharSequence getBankName() {
    return bankName;
  }

  /**
   * Sets the value of the 'bankName' field.
   * @param value the value to set.
   */
  public void setBankName(java.lang.CharSequence value) {
    this.bankName = value;
  }

  /**
   * Gets the value of the 'branch' field.
   * @return The value of the 'branch' field.
   */
  public java.lang.CharSequence getBranch() {
    return branch;
  }

  /**
   * Sets the value of the 'branch' field.
   * @param value the value to set.
   */
  public void setBranch(java.lang.CharSequence value) {
    this.branch = value;
  }

  /**
   * Gets the value of the 'branchAddress' field.
   * @return The value of the 'branchAddress' field.
   */
  public java.lang.CharSequence getBranchAddress() {
    return branchAddress;
  }

  /**
   * Sets the value of the 'branchAddress' field.
   * @param value the value to set.
   */
  public void setBranchAddress(java.lang.CharSequence value) {
    this.branchAddress = value;
  }

  /**
   * Gets the value of the 'collateralDetail' field.
   * @return The value of the 'collateralDetail' field.
   */
  public com.vishaluplanch.org.schemas.CollateralDetail getCollateralDetail() {
    return collateralDetail;
  }

  /**
   * Sets the value of the 'collateralDetail' field.
   * @param value the value to set.
   */
  public void setCollateralDetail(com.vishaluplanch.org.schemas.CollateralDetail value) {
    this.collateralDetail = value;
  }

  /**
   * Gets the value of the 'loanAccountNum' field.
   * @return The value of the 'loanAccountNum' field.
   */
  public java.lang.Long getLoanAccountNum() {
    return loanAccountNum;
  }

  /**
   * Sets the value of the 'loanAccountNum' field.
   * @param value the value to set.
   */
  public void setLoanAccountNum(java.lang.Long value) {
    this.loanAccountNum = value;
  }

  /**
   * Gets the value of the 'loanApprovalDate' field.
   * @return The value of the 'loanApprovalDate' field.
   */
  public java.lang.CharSequence getLoanApprovalDate() {
    return loanApprovalDate;
  }

  /**
   * Sets the value of the 'loanApprovalDate' field.
   * @param value the value to set.
   */
  public void setLoanApprovalDate(java.lang.CharSequence value) {
    this.loanApprovalDate = value;
  }

  /**
   * Gets the value of the 'loanId' field.
   * @return The value of the 'loanId' field.
   */
  public java.lang.Long getLoanId() {
    return loanId;
  }

  /**
   * Sets the value of the 'loanId' field.
   * @param value the value to set.
   */
  public void setLoanId(java.lang.Long value) {
    this.loanId = value;
  }

  /**
   * Gets the value of the 'micrCode' field.
   * @return The value of the 'micrCode' field.
   */
  public java.lang.CharSequence getMicrCode() {
    return micrCode;
  }

  /**
   * Sets the value of the 'micrCode' field.
   * @param value the value to set.
   */
  public void setMicrCode(java.lang.CharSequence value) {
    this.micrCode = value;
  }

  /**
   * Gets the value of the 'requestedLoanAmount' field.
   * @return The value of the 'requestedLoanAmount' field.
   */
  public java.math.BigDecimal getRequestedLoanAmount() {
    return requestedLoanAmount;
  }

  /**
   * Sets the value of the 'requestedLoanAmount' field.
   * @param value the value to set.
   */
  public void setRequestedLoanAmount(java.math.BigDecimal value) {
    this.requestedLoanAmount = value;
  }

  /**
   * Creates a new LoanDetail RecordBuilder.
   * @return A new LoanDetail RecordBuilder
   */
  public static com.vishaluplanch.org.schemas.LoanDetail.Builder newBuilder() {
    return new com.vishaluplanch.org.schemas.LoanDetail.Builder();
  }

  /**
   * Creates a new LoanDetail RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new LoanDetail RecordBuilder
   */
  public static com.vishaluplanch.org.schemas.LoanDetail.Builder newBuilder(com.vishaluplanch.org.schemas.LoanDetail.Builder other) {
    return new com.vishaluplanch.org.schemas.LoanDetail.Builder(other);
  }

  /**
   * Creates a new LoanDetail RecordBuilder by copying an existing LoanDetail instance.
   * @param other The existing instance to copy.
   * @return A new LoanDetail RecordBuilder
   */
  public static com.vishaluplanch.org.schemas.LoanDetail.Builder newBuilder(com.vishaluplanch.org.schemas.LoanDetail other) {
    return new com.vishaluplanch.org.schemas.LoanDetail.Builder(other);
  }

  /**
   * RecordBuilder for LoanDetail instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<LoanDetail>
    implements org.apache.avro.data.RecordBuilder<LoanDetail> {

    private com.vishaluplanch.org.schemas.ApplicantDetail applicantDetail;
    private com.vishaluplanch.org.schemas.ApplicantDetail.Builder applicantDetailBuilder;
    private java.math.BigDecimal approvedLoanAmount;
    private java.lang.CharSequence bankName;
    private java.lang.CharSequence branch;
    private java.lang.CharSequence branchAddress;
    private com.vishaluplanch.org.schemas.CollateralDetail collateralDetail;
    private com.vishaluplanch.org.schemas.CollateralDetail.Builder collateralDetailBuilder;
    private long loanAccountNum;
    private java.lang.CharSequence loanApprovalDate;
    private long loanId;
    private java.lang.CharSequence micrCode;
    private java.math.BigDecimal requestedLoanAmount;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.vishaluplanch.org.schemas.LoanDetail.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.applicantDetail)) {
        this.applicantDetail = data().deepCopy(fields()[0].schema(), other.applicantDetail);
        fieldSetFlags()[0] = true;
      }
      if (other.hasApplicantDetailBuilder()) {
        this.applicantDetailBuilder = com.vishaluplanch.org.schemas.ApplicantDetail.newBuilder(other.getApplicantDetailBuilder());
      }
      if (isValidValue(fields()[1], other.approvedLoanAmount)) {
        this.approvedLoanAmount = data().deepCopy(fields()[1].schema(), other.approvedLoanAmount);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.bankName)) {
        this.bankName = data().deepCopy(fields()[2].schema(), other.bankName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.branch)) {
        this.branch = data().deepCopy(fields()[3].schema(), other.branch);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.branchAddress)) {
        this.branchAddress = data().deepCopy(fields()[4].schema(), other.branchAddress);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.collateralDetail)) {
        this.collateralDetail = data().deepCopy(fields()[5].schema(), other.collateralDetail);
        fieldSetFlags()[5] = true;
      }
      if (other.hasCollateralDetailBuilder()) {
        this.collateralDetailBuilder = com.vishaluplanch.org.schemas.CollateralDetail.newBuilder(other.getCollateralDetailBuilder());
      }
      if (isValidValue(fields()[6], other.loanAccountNum)) {
        this.loanAccountNum = data().deepCopy(fields()[6].schema(), other.loanAccountNum);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.loanApprovalDate)) {
        this.loanApprovalDate = data().deepCopy(fields()[7].schema(), other.loanApprovalDate);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.loanId)) {
        this.loanId = data().deepCopy(fields()[8].schema(), other.loanId);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.micrCode)) {
        this.micrCode = data().deepCopy(fields()[9].schema(), other.micrCode);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.requestedLoanAmount)) {
        this.requestedLoanAmount = data().deepCopy(fields()[10].schema(), other.requestedLoanAmount);
        fieldSetFlags()[10] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing LoanDetail instance
     * @param other The existing instance to copy.
     */
    private Builder(com.vishaluplanch.org.schemas.LoanDetail other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.applicantDetail)) {
        this.applicantDetail = data().deepCopy(fields()[0].schema(), other.applicantDetail);
        fieldSetFlags()[0] = true;
      }
      this.applicantDetailBuilder = null;
      if (isValidValue(fields()[1], other.approvedLoanAmount)) {
        this.approvedLoanAmount = data().deepCopy(fields()[1].schema(), other.approvedLoanAmount);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.bankName)) {
        this.bankName = data().deepCopy(fields()[2].schema(), other.bankName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.branch)) {
        this.branch = data().deepCopy(fields()[3].schema(), other.branch);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.branchAddress)) {
        this.branchAddress = data().deepCopy(fields()[4].schema(), other.branchAddress);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.collateralDetail)) {
        this.collateralDetail = data().deepCopy(fields()[5].schema(), other.collateralDetail);
        fieldSetFlags()[5] = true;
      }
      this.collateralDetailBuilder = null;
      if (isValidValue(fields()[6], other.loanAccountNum)) {
        this.loanAccountNum = data().deepCopy(fields()[6].schema(), other.loanAccountNum);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.loanApprovalDate)) {
        this.loanApprovalDate = data().deepCopy(fields()[7].schema(), other.loanApprovalDate);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.loanId)) {
        this.loanId = data().deepCopy(fields()[8].schema(), other.loanId);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.micrCode)) {
        this.micrCode = data().deepCopy(fields()[9].schema(), other.micrCode);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.requestedLoanAmount)) {
        this.requestedLoanAmount = data().deepCopy(fields()[10].schema(), other.requestedLoanAmount);
        fieldSetFlags()[10] = true;
      }
    }

    /**
      * Gets the value of the 'applicantDetail' field.
      * @return The value.
      */
    public com.vishaluplanch.org.schemas.ApplicantDetail getApplicantDetail() {
      return applicantDetail;
    }

    /**
      * Sets the value of the 'applicantDetail' field.
      * @param value The value of 'applicantDetail'.
      * @return This builder.
      */
    public com.vishaluplanch.org.schemas.LoanDetail.Builder setApplicantDetail(com.vishaluplanch.org.schemas.ApplicantDetail value) {
      validate(fields()[0], value);
      this.applicantDetailBuilder = null;
      this.applicantDetail = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'applicantDetail' field has been set.
      * @return True if the 'applicantDetail' field has been set, false otherwise.
      */
    public boolean hasApplicantDetail() {
      return fieldSetFlags()[0];
    }

    /**
     * Gets the Builder instance for the 'applicantDetail' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.vishaluplanch.org.schemas.ApplicantDetail.Builder getApplicantDetailBuilder() {
      if (applicantDetailBuilder == null) {
        if (hasApplicantDetail()) {
          setApplicantDetailBuilder(com.vishaluplanch.org.schemas.ApplicantDetail.newBuilder(applicantDetail));
        } else {
          setApplicantDetailBuilder(com.vishaluplanch.org.schemas.ApplicantDetail.newBuilder());
        }
      }
      return applicantDetailBuilder;
    }

    /**
     * Sets the Builder instance for the 'applicantDetail' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.vishaluplanch.org.schemas.LoanDetail.Builder setApplicantDetailBuilder(com.vishaluplanch.org.schemas.ApplicantDetail.Builder value) {
      clearApplicantDetail();
      applicantDetailBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'applicantDetail' field has an active Builder instance
     * @return True if the 'applicantDetail' field has an active Builder instance
     */
    public boolean hasApplicantDetailBuilder() {
      return applicantDetailBuilder != null;
    }

    /**
      * Clears the value of the 'applicantDetail' field.
      * @return This builder.
      */
    public com.vishaluplanch.org.schemas.LoanDetail.Builder clearApplicantDetail() {
      applicantDetail = null;
      applicantDetailBuilder = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'approvedLoanAmount' field.
      * @return The value.
      */
    public java.math.BigDecimal getApprovedLoanAmount() {
      return approvedLoanAmount;
    }

    /**
      * Sets the value of the 'approvedLoanAmount' field.
      * @param value The value of 'approvedLoanAmount'.
      * @return This builder.
      */
    public com.vishaluplanch.org.schemas.LoanDetail.Builder setApprovedLoanAmount(java.math.BigDecimal value) {
      validate(fields()[1], value);
      this.approvedLoanAmount = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'approvedLoanAmount' field has been set.
      * @return True if the 'approvedLoanAmount' field has been set, false otherwise.
      */
    public boolean hasApprovedLoanAmount() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'approvedLoanAmount' field.
      * @return This builder.
      */
    public com.vishaluplanch.org.schemas.LoanDetail.Builder clearApprovedLoanAmount() {
      approvedLoanAmount = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'bankName' field.
      * @return The value.
      */
    public java.lang.CharSequence getBankName() {
      return bankName;
    }

    /**
      * Sets the value of the 'bankName' field.
      * @param value The value of 'bankName'.
      * @return This builder.
      */
    public com.vishaluplanch.org.schemas.LoanDetail.Builder setBankName(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.bankName = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'bankName' field has been set.
      * @return True if the 'bankName' field has been set, false otherwise.
      */
    public boolean hasBankName() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'bankName' field.
      * @return This builder.
      */
    public com.vishaluplanch.org.schemas.LoanDetail.Builder clearBankName() {
      bankName = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'branch' field.
      * @return The value.
      */
    public java.lang.CharSequence getBranch() {
      return branch;
    }

    /**
      * Sets the value of the 'branch' field.
      * @param value The value of 'branch'.
      * @return This builder.
      */
    public com.vishaluplanch.org.schemas.LoanDetail.Builder setBranch(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.branch = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'branch' field has been set.
      * @return True if the 'branch' field has been set, false otherwise.
      */
    public boolean hasBranch() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'branch' field.
      * @return This builder.
      */
    public com.vishaluplanch.org.schemas.LoanDetail.Builder clearBranch() {
      branch = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'branchAddress' field.
      * @return The value.
      */
    public java.lang.CharSequence getBranchAddress() {
      return branchAddress;
    }

    /**
      * Sets the value of the 'branchAddress' field.
      * @param value The value of 'branchAddress'.
      * @return This builder.
      */
    public com.vishaluplanch.org.schemas.LoanDetail.Builder setBranchAddress(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.branchAddress = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'branchAddress' field has been set.
      * @return True if the 'branchAddress' field has been set, false otherwise.
      */
    public boolean hasBranchAddress() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'branchAddress' field.
      * @return This builder.
      */
    public com.vishaluplanch.org.schemas.LoanDetail.Builder clearBranchAddress() {
      branchAddress = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'collateralDetail' field.
      * @return The value.
      */
    public com.vishaluplanch.org.schemas.CollateralDetail getCollateralDetail() {
      return collateralDetail;
    }

    /**
      * Sets the value of the 'collateralDetail' field.
      * @param value The value of 'collateralDetail'.
      * @return This builder.
      */
    public com.vishaluplanch.org.schemas.LoanDetail.Builder setCollateralDetail(com.vishaluplanch.org.schemas.CollateralDetail value) {
      validate(fields()[5], value);
      this.collateralDetailBuilder = null;
      this.collateralDetail = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'collateralDetail' field has been set.
      * @return True if the 'collateralDetail' field has been set, false otherwise.
      */
    public boolean hasCollateralDetail() {
      return fieldSetFlags()[5];
    }

    /**
     * Gets the Builder instance for the 'collateralDetail' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.vishaluplanch.org.schemas.CollateralDetail.Builder getCollateralDetailBuilder() {
      if (collateralDetailBuilder == null) {
        if (hasCollateralDetail()) {
          setCollateralDetailBuilder(com.vishaluplanch.org.schemas.CollateralDetail.newBuilder(collateralDetail));
        } else {
          setCollateralDetailBuilder(com.vishaluplanch.org.schemas.CollateralDetail.newBuilder());
        }
      }
      return collateralDetailBuilder;
    }

    /**
     * Sets the Builder instance for the 'collateralDetail' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.vishaluplanch.org.schemas.LoanDetail.Builder setCollateralDetailBuilder(com.vishaluplanch.org.schemas.CollateralDetail.Builder value) {
      clearCollateralDetail();
      collateralDetailBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'collateralDetail' field has an active Builder instance
     * @return True if the 'collateralDetail' field has an active Builder instance
     */
    public boolean hasCollateralDetailBuilder() {
      return collateralDetailBuilder != null;
    }

    /**
      * Clears the value of the 'collateralDetail' field.
      * @return This builder.
      */
    public com.vishaluplanch.org.schemas.LoanDetail.Builder clearCollateralDetail() {
      collateralDetail = null;
      collateralDetailBuilder = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'loanAccountNum' field.
      * @return The value.
      */
    public java.lang.Long getLoanAccountNum() {
      return loanAccountNum;
    }

    /**
      * Sets the value of the 'loanAccountNum' field.
      * @param value The value of 'loanAccountNum'.
      * @return This builder.
      */
    public com.vishaluplanch.org.schemas.LoanDetail.Builder setLoanAccountNum(long value) {
      validate(fields()[6], value);
      this.loanAccountNum = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'loanAccountNum' field has been set.
      * @return True if the 'loanAccountNum' field has been set, false otherwise.
      */
    public boolean hasLoanAccountNum() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'loanAccountNum' field.
      * @return This builder.
      */
    public com.vishaluplanch.org.schemas.LoanDetail.Builder clearLoanAccountNum() {
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'loanApprovalDate' field.
      * @return The value.
      */
    public java.lang.CharSequence getLoanApprovalDate() {
      return loanApprovalDate;
    }

    /**
      * Sets the value of the 'loanApprovalDate' field.
      * @param value The value of 'loanApprovalDate'.
      * @return This builder.
      */
    public com.vishaluplanch.org.schemas.LoanDetail.Builder setLoanApprovalDate(java.lang.CharSequence value) {
      validate(fields()[7], value);
      this.loanApprovalDate = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'loanApprovalDate' field has been set.
      * @return True if the 'loanApprovalDate' field has been set, false otherwise.
      */
    public boolean hasLoanApprovalDate() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'loanApprovalDate' field.
      * @return This builder.
      */
    public com.vishaluplanch.org.schemas.LoanDetail.Builder clearLoanApprovalDate() {
      loanApprovalDate = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'loanId' field.
      * @return The value.
      */
    public java.lang.Long getLoanId() {
      return loanId;
    }

    /**
      * Sets the value of the 'loanId' field.
      * @param value The value of 'loanId'.
      * @return This builder.
      */
    public com.vishaluplanch.org.schemas.LoanDetail.Builder setLoanId(long value) {
      validate(fields()[8], value);
      this.loanId = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'loanId' field has been set.
      * @return True if the 'loanId' field has been set, false otherwise.
      */
    public boolean hasLoanId() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'loanId' field.
      * @return This builder.
      */
    public com.vishaluplanch.org.schemas.LoanDetail.Builder clearLoanId() {
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
      * Gets the value of the 'micrCode' field.
      * @return The value.
      */
    public java.lang.CharSequence getMicrCode() {
      return micrCode;
    }

    /**
      * Sets the value of the 'micrCode' field.
      * @param value The value of 'micrCode'.
      * @return This builder.
      */
    public com.vishaluplanch.org.schemas.LoanDetail.Builder setMicrCode(java.lang.CharSequence value) {
      validate(fields()[9], value);
      this.micrCode = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
      * Checks whether the 'micrCode' field has been set.
      * @return True if the 'micrCode' field has been set, false otherwise.
      */
    public boolean hasMicrCode() {
      return fieldSetFlags()[9];
    }


    /**
      * Clears the value of the 'micrCode' field.
      * @return This builder.
      */
    public com.vishaluplanch.org.schemas.LoanDetail.Builder clearMicrCode() {
      micrCode = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    /**
      * Gets the value of the 'requestedLoanAmount' field.
      * @return The value.
      */
    public java.math.BigDecimal getRequestedLoanAmount() {
      return requestedLoanAmount;
    }

    /**
      * Sets the value of the 'requestedLoanAmount' field.
      * @param value The value of 'requestedLoanAmount'.
      * @return This builder.
      */
    public com.vishaluplanch.org.schemas.LoanDetail.Builder setRequestedLoanAmount(java.math.BigDecimal value) {
      validate(fields()[10], value);
      this.requestedLoanAmount = value;
      fieldSetFlags()[10] = true;
      return this;
    }

    /**
      * Checks whether the 'requestedLoanAmount' field has been set.
      * @return True if the 'requestedLoanAmount' field has been set, false otherwise.
      */
    public boolean hasRequestedLoanAmount() {
      return fieldSetFlags()[10];
    }


    /**
      * Clears the value of the 'requestedLoanAmount' field.
      * @return This builder.
      */
    public com.vishaluplanch.org.schemas.LoanDetail.Builder clearRequestedLoanAmount() {
      requestedLoanAmount = null;
      fieldSetFlags()[10] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public LoanDetail build() {
      try {
        LoanDetail record = new LoanDetail();
        if (applicantDetailBuilder != null) {
          record.applicantDetail = this.applicantDetailBuilder.build();
        } else {
          record.applicantDetail = fieldSetFlags()[0] ? this.applicantDetail : (com.vishaluplanch.org.schemas.ApplicantDetail) defaultValue(fields()[0]);
        }
        record.approvedLoanAmount = fieldSetFlags()[1] ? this.approvedLoanAmount : (java.math.BigDecimal) defaultValue(fields()[1]);
        record.bankName = fieldSetFlags()[2] ? this.bankName : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.branch = fieldSetFlags()[3] ? this.branch : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.branchAddress = fieldSetFlags()[4] ? this.branchAddress : (java.lang.CharSequence) defaultValue(fields()[4]);
        if (collateralDetailBuilder != null) {
          record.collateralDetail = this.collateralDetailBuilder.build();
        } else {
          record.collateralDetail = fieldSetFlags()[5] ? this.collateralDetail : (com.vishaluplanch.org.schemas.CollateralDetail) defaultValue(fields()[5]);
        }
        record.loanAccountNum = fieldSetFlags()[6] ? this.loanAccountNum : (java.lang.Long) defaultValue(fields()[6]);
        record.loanApprovalDate = fieldSetFlags()[7] ? this.loanApprovalDate : (java.lang.CharSequence) defaultValue(fields()[7]);
        record.loanId = fieldSetFlags()[8] ? this.loanId : (java.lang.Long) defaultValue(fields()[8]);
        record.micrCode = fieldSetFlags()[9] ? this.micrCode : (java.lang.CharSequence) defaultValue(fields()[9]);
        record.requestedLoanAmount = fieldSetFlags()[10] ? this.requestedLoanAmount : (java.math.BigDecimal) defaultValue(fields()[10]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<LoanDetail>
    WRITER$ = (org.apache.avro.io.DatumWriter<LoanDetail>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<LoanDetail>
    READER$ = (org.apache.avro.io.DatumReader<LoanDetail>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}