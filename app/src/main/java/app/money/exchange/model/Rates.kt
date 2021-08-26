package app.money.exchange.model

import com.google.gson.annotations.SerializedName

data class Rates(

        @SerializedName("provider")
        val provider: String,
        @SerializedName("terms")
        val terms: String,
        @SerializedName("base")
        val base: String,
        @SerializedName("date")
        val date: String,
        @SerializedName("rates")
        val rates: HashMap<String, String>
)

data class RateList(
        @SerializedName("USD")
        val  usd: Double ,
        @SerializedName("AED")
        val  aed: Double ,
        @SerializedName("AFN")
        val  afn: Double ,
        @SerializedName("ALL")
        val  all: Double ,
        @SerializedName("AMD")
        val  amd: Double ,
        @SerializedName("ANG")
        val  ang: Double ,
        @SerializedName("AOA")
        val  aoa: Double ,
        @SerializedName("ARS")
        val  ars: Double ,
        @SerializedName("AUD")
        val  aud: Double ,
        @SerializedName("AWG")
        val  awg: Double ,
        @SerializedName("AZN")
        val  azn: Double ,
        @SerializedName("BAM")
        val  bam: Double ,
        @SerializedName("BBD")
        val  bbd: Double ,
        @SerializedName("BDT")
        val  bdt: Double ,
        @SerializedName("BGN")
        val  bgn: Double ,
        @SerializedName("BHD")
        val  bhd: Double ,
        @SerializedName("BIF")
        val  bif: Double ,
        @SerializedName("BMD")
        val  bmd: Double ,
        @SerializedName("BND")
        val  bnd: Double ,
        @SerializedName("BOB")
        val  bob: Double ,
        @SerializedName("BRL")
        val  brl: Double ,
        @SerializedName("BSD")
        val  bsd: Double ,
        @SerializedName("BTN")
        val  btn: Double ,
        @SerializedName("BWP")
        val  bwp: Double ,
        @SerializedName("BYN")
        val  byn: Double ,
        @SerializedName("BZD")
        val  bzd: Double ,
        @SerializedName("CAD")
        val  cad: Double ,
        @SerializedName("CDF")
        val  cdf: Double ,
        @SerializedName("CHF")
        val  chf: Double ,
        @SerializedName("CLP")
        val  clp: Double ,
        @SerializedName("CNY")
        val  cny: Double ,
        @SerializedName("COP")
        val  cop: Double ,
        @SerializedName("CRC")
        val  crc: Double ,
        @SerializedName("CUC")
        val  cuc: Double ,
        @SerializedName("CUP")
        val  cup: Double ,
        @SerializedName("CVE")
        val  cve: Double ,
        @SerializedName("CZK")
        val  czk: Double ,
        @SerializedName("DJF")
        val  djf: Double ,
        @SerializedName("DKK")
        val  dkk: Double ,
        @SerializedName("DOP")
        val  dop: Double ,
        @SerializedName("DZD")
        val  dzd: Double ,
           @SerializedName("EGP")
          val  egp: Double ,
          @SerializedName("ERN")
          val  ern: Double ,
          @SerializedName("ETB")
          val  etb: Double ,
          @SerializedName("EUR")
          val  eur: Double ,
          @SerializedName("FJD")
          val  fjd: Double ,
          @SerializedName("FKP")
          val  fkp: Double ,
          @SerializedName("FOK")
          val  fok: Double ,
          @SerializedName("GBP")
          val  gbp: Double ,
          @SerializedName("GEL")
          val  gel: Double ,
          @SerializedName("GGP")
          val  ggp: Double ,
          @SerializedName("GHS")
          val  ghs: Double ,
          @SerializedName("GIP")
          val  gip: Double ,
          @SerializedName("GMD")
          val  gmd: Double ,
          @SerializedName("GNF")
          val  gnf: Double ,
          @SerializedName("GTQ")
          val  gtq: Double ,
          @SerializedName("GYD")
          val  gyd: Double ,
          @SerializedName("HKD")
          val  hkd: Double ,
          @SerializedName("HNL")
          val  hnl: Double ,
          @SerializedName("HRK")
          val  hrk: Double ,
          @SerializedName("HTG")
          val  htg: Double ,
          @SerializedName("HUF")
          val  huf: Double ,
          @SerializedName("IDR")
          val  idr: Double ,
          @SerializedName("ILS")
          val  ils: Double ,
          @SerializedName("IMP")
          val  imp: Double ,
          @SerializedName("INR")
          val  inr: Double ,
          @SerializedName("IQD")
          val  iqd: Double ,
          @SerializedName("IRR")
          val  irr: Double ,
          @SerializedName("ISK")
          val  isk: Double ,
          @SerializedName("JMD")
          val  jmd: Double ,
          @SerializedName("JOD")
          val  jod: Double ,
          @SerializedName("JPY")
          val  jpy: Double ,
          @SerializedName("KES")
          val  kes: Double ,
          @SerializedName("KGS")
          val  kgs: Double ,
          @SerializedName("KHR")
          val  khr: Double ,
          @SerializedName("KID")
          val  kid: Double ,
          @SerializedName("KMF")
          val  kmf: Double ,
          @SerializedName("KRW")
          val  krw: Double ,
          @SerializedName("KWD")
          val  kwd: Double ,
          @SerializedName("KYD")
          val  kyd: Double ,
          @SerializedName("KZT")
          val  kzt: Double ,
          @SerializedName("LAK")
          val  lak: Double ,
          @SerializedName("LBP")
          val  lbp: Double ,
          @SerializedName("LKR")
          val  lkr: Double ,
          @SerializedName("LRD")
          val  lrd: Double ,
          @SerializedName("LSL")
          val  lsl: Double ,
          @SerializedName("LYD")
          val  lyd: Double ,
          @SerializedName("MAD")
          val  mad: Double ,
          @SerializedName("MDL")
          val  mdl: Double ,
          @SerializedName("MGA")
          val  mga: Double ,
          @SerializedName("MKD")
          val  mkd: Double ,
          @SerializedName("MMK")
          val  mmk: Double ,
          @SerializedName("MNT")
          val  mnt: Double ,
          @SerializedName("MOP")
          val  mop: Double ,
          @SerializedName("MRU")
          val  mru: Double ,
          @SerializedName("MUR")
          val  mur: Double ,
          @SerializedName("MVR")
          val  mvr: Double ,
          @SerializedName("MWK")
          val  mwk: Double ,
          @SerializedName("MXN")
          val  mxn: Double ,
          @SerializedName("MYR")
          val  myr: Double ,
          @SerializedName("MZN")
          val  mzn: Double ,
          @SerializedName("NAD")
          val  nad: Double ,
          @SerializedName("NGN")
          val  ngn: Double ,
          @SerializedName("NIO")
          val  nio: Double ,
          @SerializedName("NOK")
          val  nok: Double ,
          @SerializedName("NPR")
          val  npr: Double ,
          @SerializedName("NZD")
          val  nzd: Double ,
          @SerializedName("OMR")
          val  omr: Double ,
          @SerializedName("PAB")
          val  pab: Double ,
          @SerializedName("PEN")
          val  pen: Double ,
          @SerializedName("PGK")
          val  pgk: Double ,
          @SerializedName("PHP")
          val  php: Double ,
          @SerializedName("PKR")
          val  pkr: Double ,
          @SerializedName("PLN")
          val  pln: Double ,
          @SerializedName("PYG")
          val  pyg: Double ,
          @SerializedName("QAR")
          val  qar: Double ,
          @SerializedName("RON")
          val  ron: Double ,
          @SerializedName("RSD")
          val  rsd: Double ,
          @SerializedName("RUB")
          val  rub: Double ,
          @SerializedName("RWF")
          val  rwf: Double ,
          @SerializedName("SAR")
          val  sar: Double ,
          @SerializedName("SBD")
          val  sbd: Double ,
          @SerializedName("SCR")
          val  scr: Double ,
          @SerializedName("SDG")
          val  sdg: Double ,
          @SerializedName("SEK")
          val  sek: Double ,
          @SerializedName("SGD")
          val  sgd: Double ,
          @SerializedName("SHP")
          val  shp: Double ,)
        /*  @SerializedName("SLL")
          val  sll: Double ,
          @SerializedName("SOS")
          val  sos: Double ,
          @SerializedName("SRD")
          val  srd: Double ,
          @SerializedName("SSP")
          val  ssp: Double ,
          @SerializedName("STN")
          val  stn: Double ,
          @SerializedName("SYP")
          val  syp: Double ,
          @SerializedName("SZL")
          val  szl: Double ,
          @SerializedName("THB")
          val  thb: Double ,
          @SerializedName("TJS")
          val  tjs: Double ,
          @SerializedName("TMT")
          val  tmt: Double ,
          @SerializedName("TND")
          val  tnd: Double ,
          @SerializedName("TOP")
          val  top: Double ,
          @SerializedName("TRY")
          val  _try: Double ,
          @SerializedName("TTD")
          val  ttd: Double ,
          @SerializedName("TVD")
          val  tvd: Double ,
          @SerializedName("TWD")
          val  twd: Double ,
          @SerializedName("TZS")
          val  tzs: Double ,
          @SerializedName("UAH")
          val  uah: Double ,
          @SerializedName("UGX")
          val  ugx: Double ,
          @SerializedName("UYU")
          val  uyu: Double ,
          @SerializedName("UZS")
          val  uzs: Double ,
          @SerializedName("VES")
          val  ves: Double ,
          @SerializedName("VND")
          val  vnd: Double ,
          @SerializedName("VUV")
          val  vuv: Double ,
          @SerializedName("WST")
          val  wst: Double ,
          @SerializedName("XAF")
          val  xaf: Double ,
          @SerializedName("XCD")
          val  xcd: Double ,
          @SerializedName("XDR")
          val  xdr: Double ,
          @SerializedName("XOF")
          val  xof: Double ,
          @SerializedName("XPF")
          val  xpf: Double ,
          @SerializedName("YER")
          val  yer: Double ,
          @SerializedName("ZAR")
          val  zar: Double ,
          @SerializedName("ZMW")
          val  zmw: Double
  )*/
