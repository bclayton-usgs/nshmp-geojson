package gov.usgs.earthquake.nshmp.geojson;

/**
 * Interface for all {@link GeoJsonType}s to implement.
 * 
 * @author Brandon Clayton
 */
public interface GeoJson {

  /**
   * Return the {@link GeoJsonType} representing the {@code Geometry}.
   * @return The {@code GeoJsonType}.
   */
  public GeoJsonType getType();

  /**
   * Return a {@code String} in JSON format.
   * @return The JSON {@code String}
   */
  public String toJsonString();
  
}
