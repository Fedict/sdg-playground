# Link repository tools

Automate the exchange of links to information on several regional/national pages to the EU link repository tool.

## Export / publish links to information, from existing sites

### For Drupal 7/8 websites

An easy way would be to 
- add a `part of SDG` checkbox field to the `content type` + a field with drop-down list of categories/SDG Annex events (`taxonomy`)
- create a `View` listing all the `nodes` having the `part of SDG` checkbox checked
  - with a title, description and link to the webpage
  - if the content is available in multiple languages, the `node ID` could be used to group (or remove) translations of the same content
- either publish this View as a:
  - newsfeed (RSS/XML, JSON...), which should be fairly easy to process automaticaly, 
  - or as an HTML webpage, which could be scraped and may require some extra coding

## Collect / harvest the the links from the various sources

TO DEVELOP

## Transform to an input format suitable for the EU link repository

TO DEVELOP
