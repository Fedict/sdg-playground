# Components (to be developed)

## Sign-up website / API

### Bulk sign-up command line tool

Loads a structured file (CSV or RDF) and uses the sign-up API to create accounts in bulk.

## Rating API

API for submitting user ratings to the central feedback collection tool.

Parameters:
- procedure ID
- site ID
- language
- webpage URL

## Calculated rating service / API (read-only, public)

Returns a (series of) ratings for a given procedure or service.
Can be either very specific for a procedure in a specific language on a specific website, or based on the ratings on all websites in any language.

Parameters:
- procedure ID
- (optional) site ID
- (optional) language

### Statistics javascript widget

Visualizes the ratings (e.g. as stars or one a scale) on a website

## Mail service
